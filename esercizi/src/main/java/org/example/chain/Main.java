package org.example.chain;

public class Main {
    public static void main(String[] args) {
        Sottotenente sottotenente = new Sottotenente();
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Generale generale = new Generale();

        sottotenente.setSuperiore(tenente);
        tenente.setSuperiore(capitano);
        capitano.setSuperiore(generale);

        sottotenente.applicaTrattenuta(6000);




    }
}
