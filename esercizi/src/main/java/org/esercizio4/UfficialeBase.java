package org.esercizio4;

public abstract class UfficialeBase implements Ufficiale {
	protected Ufficiale superiore;
	protected int stipendio;
	protected String grado;

	@Override
	public void setSuperiore (Ufficiale superiore) {
		this.superiore = superiore;
	}

	@Override
	public int getStipendio () {
		return stipendio;
	}

	@Override
	public String getGrado () {
		return grado;
	}

	@Override
	public void verificaStipendio (int importo) {
		if (stipendio >= importo) {
			System.out.println(grado + " percepisce " + stipendio + "€, soddisfa l'importo richiesto: " + importo + "€");
		} else if (superiore != null) {
			superiore.verificaStipendio(importo);
		} else {
			System.out.println("Nessun ufficiale percepisce almeno " + importo + "€");
		}
	}
}
