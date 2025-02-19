package org.esercizio1;

public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}

	@Override
	public String toString() {
		return "Nome Completo: " + nomeCompleto + ", Età: " + eta;
	}
}
