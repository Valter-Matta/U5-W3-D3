package org.esercizio1;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
	private Info info;

	public InfoAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		if (info.getDataDiNascita() == null) {
			return 0; // O gestisci diversamente l'assenza della data
		}
		Calendar nascita = Calendar.getInstance();
		nascita.setTime(info.getDataDiNascita());

		Calendar oggi = Calendar.getInstance();

		int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
		if (oggi.get(Calendar.DAY_OF_YEAR) < nascita.get(Calendar.DAY_OF_YEAR)) {
			eta--;
		}

		return eta;
	}
}