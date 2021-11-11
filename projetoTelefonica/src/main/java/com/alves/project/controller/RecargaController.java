package com.alves.project.controller;

import com.alves.project.service.RecargaProducer;
import com.alves.project.request.TransacaoMessage;
import com.alves.project.repository.RecargaRepository;
import com.alves.project.request.RecargaRequest;
import com.alves.project.entities.Recarga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/recarga")
public class RecargaController {

	Logger logger = LoggerFactory.getLogger(RecargaController.class);

	@Autowired
	private RecargaRepository recargaRepository;

	@Autowired
	private RecargaProducer recargaProducer;

	@PostMapping
    public ResponseEntity<?> recarrega(@Valid @RequestBody RecargaRequest recargaRequest){
        logger.info("Chamando a API externa orquestrador");
        Recarga recarga = recargaRequest.toModel();
        recargaRepository.save(recarga);
        TransacaoMessage transacaoMessage = new TransacaoMessage(recargaRequest.getOperadora().toString(), recargaRequest.getValor(), LocalDateTime.now().toString(), 1L, 2L);
        recargaProducer.send(transacaoMessage);

        return ResponseEntity.ok().build();
    }
