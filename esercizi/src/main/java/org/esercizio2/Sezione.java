package org.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ComponenteLibro {
	private String titolo;
	private List<ComponenteLibro> elementi = new ArrayList<>();

	public Sezione(String titolo) {
		this.titolo = titolo;
	}

	public void aggiungiElemento(ComponenteLibro elemento) {
		elementi.add(elemento);
	}

	@Override
	public void stampa() {
		System.out.println("Sezione: " + titolo);
		for (ComponenteLibro elemento : elementi) {
			elemento.stampa();
		}
	}

	@Override
	public int getNumeroPagine() {
		int totale = 0;
		for (ComponenteLibro elemento : elementi) {
			totale += elemento.getNumeroPagine();
		}
		return totale;
	}
}