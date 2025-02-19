package org.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String titolo;
	private List<String> autori = new ArrayList<>();
	private double prezzo;
	private List<ComponenteLibro> elementi = new ArrayList<>();

	public Libro(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	public void aggiungiAutore(String autore) {
		autori.add(autore);
	}

	public void aggiungiElemento(ComponenteLibro elemento) {
		elementi.add(elemento);
	}

	public void stampa() {
		System.out.println("Libro: " + titolo);
		System.out.println("Autori: " + String.join(", ", autori));
		System.out.println("Prezzo: " + prezzo + "€");
		for (ComponenteLibro elemento : elementi) {
			elemento.stampa();
		}
	}

	public int getNumeroTotalePagine() {
		int totale = 0;
		for (ComponenteLibro elemento : elementi) {
			totale += elemento.getNumeroPagine();
		}
		return totale;
	}
}
