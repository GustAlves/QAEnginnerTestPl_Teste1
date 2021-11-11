package com.alves.project.request;

import com.alves.project.entities.Recarga;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class RecargaRequest {
	@NotNull
	@Positive
	private BigDecimal valor;

	@NotNull
	private String numero;

	public RecargaRequest(BigDecimal valor, String numero) {
		this.valor = valor;
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getNumero() {
		return numero;
	}

	public Recarga toModel() {
		return new Recarga(valor, numero);
	}
}
