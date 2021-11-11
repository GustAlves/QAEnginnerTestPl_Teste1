package com.alves.project.service;

import com.alves.project.request.TransacaoMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RecargaProducer {

	private static final Logger logger = LoggerFactory.getLogger(RecargaProducer.class);
	private final String topic;
	private final KafkaTemplate<String, TransacaoMessage> kafkaTemplate;

	public RecargaProducer(@Value("${topic.name}") String topic,
			KafkaTemplate<String, TransacaoMessage> kafkaTemplate) {
		this.topic = topic;
		this.kafkaTemplate = kafkaTemplate;
	}

	public void send(TransacaoMessage transacaoMessage) {
		kafkaTemplate.send(topic, transacaoMessage).addCallback(
				success -> logger.info("Messagem send" + success.getProducerRecord().value()),
				failure -> logger.info("Message failure" + failure.getMessage()));
	}
}
