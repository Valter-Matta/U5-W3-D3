package org.example.chain;

public abstract class Ufficiale {
    private int stipendio;
    private String grado;
    private Ufficiale superiore;

    public Ufficiale(int stipendio, String grado) {
        this.stipendio = stipendio;
        this.grado = grado;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Ufficiale getSuperiore() {
        return superiore;
    }

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void applicaTrattenuta(int trattenuta) {
        if(this.getStipendio()>trattenuta) {
            System.out.println(this.getGrado() + " ha subito una trattenuta di " + trattenuta + " euro");
        } else {
            System.out.println(this.getGrado() + " non ha subito la trattenuta di " + trattenuta + " euro");
        }

        if(this.getSuperiore()!=null) {
            this.getSuperiore().applicaTrattenuta(trattenuta);
        }
    }

}
