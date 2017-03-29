package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import razmena.MenjacnicaInterfejs;

public class Menjac implements MenjacnicaInterfejs {

	LinkedList<Evro> valute = new LinkedList<>();

	@Override
	public void dodavanjeKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica) {
		Evro e = new Evro(ime, skracenica, datum);
		Kurs k = new Kurs(prodajnikurs, kupovnikurs, srednjikurs);
		e.setK(k);
		valute.add(e);
	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, String ime, String skracenica) {
		Evro e = new Evro(ime, skracenica, datum);
		for (int i = 0; i < valute.size(); i++) {
			if (e.equals(valute.get(i)))
				valute.remove(i);
		}

	}

	@Override
	public Kurs pretragaKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica) {
		Evro e = new Evro(ime, skracenica, datum);
		Kurs k = new Kurs(prodajnikurs, kupovnikurs, srednjikurs);
		e.setK(k);
		for (int i = 0; i < valute.size(); i++) {
			if (e.equals(valute.get(i)))
				return valute.get(i).getK();
		}
		return null;
	}
}
