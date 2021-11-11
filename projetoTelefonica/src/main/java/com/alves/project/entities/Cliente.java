package entities;

public class Cliente {
	private String nome_cliente;
	private Telefone telefone;
	private Conta conta;

	public void setNome(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getNome() {
		return this.nome_cliente;
	}

	public void setLinha(Telefone telefone) {
		this.telefone = telefone;
	}

	public Telefone getTelefone() {
		return this.telefone;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Conta getConta() {
		return this.conta;
	}

}
