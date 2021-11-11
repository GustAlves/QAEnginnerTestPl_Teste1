package entities;

public class Conta {
	private int saldo;
	private int vl_recarga;

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setRecarga(int vl_recarga) {
		this.vl_recarga = vl_recarga;
	}

	public int getRecarga() {
		return this.vl_recarga;
	}
}
