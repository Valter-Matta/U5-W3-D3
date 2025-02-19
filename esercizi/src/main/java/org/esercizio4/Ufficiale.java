package org.esercizio4;

public interface Ufficiale {
	void verificaStipendio (int importo);
	void setSuperiore (Ufficiale superiore);
	int getStipendio();
	String getGrado();
}

