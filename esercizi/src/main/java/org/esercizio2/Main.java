package org.esercizio2;

public class Main {
	public static void main(String[] args) {

		Libro libro = new Libro("Design Patterns in Java", 29.99);
		libro.aggiungiAutore("Gamma");
		libro.aggiungiAutore("Helm");

		Pagina p1 = new Pagina(1, "Introduzione ai pattern");
		Pagina p2 = new Pagina(2, "Cos'è il Composite Pattern");
		Pagina p3 = new Pagina(3, "Esempio pratico");

		Sezione sezione1 = new Sezione("Capitolo 1: Pattern Strutturali");
		sezione1.aggiungiElemento(p2);
		sezione1.aggiungiElemento(p3);

		Sezione sottosezione = new Sezione("Approfondimento sul Composite");
		sottosezione.aggiungiElemento(new Pagina(4, "Vantaggi del Composite"));
		sottosezione.aggiungiElemento(new Pagina(5, "Quando usarlo"));

		sezione1.aggiungiElemento(sottosezione);

		libro.aggiungiElemento(p1);
		libro.aggiungiElemento(sezione1);


		libro.stampa();

		// Numero totale di pagine
		System.out.println("Numero totale di pagine: " + libro.getNumeroTotalePagine());
	}
}
