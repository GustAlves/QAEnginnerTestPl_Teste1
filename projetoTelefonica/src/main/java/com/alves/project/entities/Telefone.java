package entities;

public class Telefone {
	private String numero_linha;
	private int saldo;

	public void setNumeroLinha(String numero_linha) {
		this.numero_linha = numero_linha;
	}

	public String getNumeroLinha() {
		return this.numero_linha;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}
}
