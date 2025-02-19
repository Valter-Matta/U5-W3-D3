package org.esercizio4;

public class Main {
	public static void main(String[] args) {
		Tenente tenente = new Tenente();
		Capitano capitano = new Capitano();
		Maggiore maggiore = new Maggiore();
		Colonnello colonnello = new Colonnello();
		Generale generale = new Generale();


		tenente.setSuperiore(capitano);
		capitano.setSuperiore(maggiore);
		maggiore.setSuperiore(colonnello);
		colonnello.setSuperiore(generale);


		System.out.println("Richiesta stipendio di almeno 1500€:");
		tenente.verificaStipendio(1500);

		System.out.println("\nRichiesta stipendio di almeno 4000€:");
		tenente.verificaStipendio(4000);

		System.out.println("\nRichiesta stipendio di almeno 6000€:");
		tenente.verificaStipendio(6000);
	}
}