package com.alves.project.request;

import java.math.BigDecimal;

public class TransacaoMessage {
	private String operacao;
	private BigDecimal valor;
	private String feitaEm;
	private Long clienteId;
	private Long conta;

	public TransacaoMessage(String operacao, BigDecimal valor, String feitaEm, Long clienteId, Long conta) {
		this.operacao = operacao;
		this.valor = valor;
		this.feitaEm = feitaEm;
		this.clienteId = clienteId;
		this.conta = conta;
	}

	public String getOperacao() {
		return operacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getFeitaEm() {
		return feitaEm;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public Long getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "TransacaoMessage{" + "operacao='" + operacao + '\'' + ", valor=" + valor + ", feitaEm='" + feitaEm
				+ '\'' + ", clienteId=" + clienteId + ", conta=" + conta + '}';
	}
}
