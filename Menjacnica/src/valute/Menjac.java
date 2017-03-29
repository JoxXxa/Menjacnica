package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import razmena.MenjacnicaInterfejs;

public class Menjac implements MenjacnicaInterfejs {

	LinkedList<Evro> valute = new LinkedList<>();

	@Override
	public void dodavanjeKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica) {
		Evro e = new Evro();
		Kurs k = new Kurs();
		if (srednjikurs > 0 && prodajnikurs > 0 && kupovnikurs > 0) {
			k.setKupovnikurs(kupovnikurs);
			k.setProdajnikurs(prodajnikurs);
			k.setSrednjikurs(srednjikurs);
			e.setDatum(datum);
		}
		e.setK(k);
		valute.add(e);
	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, String ime, String skracenica) {
		Evro e = new Evro();
		Kurs k = new Kurs();
		e.setIme(ime);
		e.setSkracenica(skracenica);
		e.setDatum(datum);
		for (int i = 0; i < valute.size(); i++) {
			if (e.equals(valute.get(i)))
				valute.remove(i);
		}

	}

	@Override
	public Kurs pretragaKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica) {
		Evro e = new Evro();
		Kurs k = new Kurs();
		k.setKupovnikurs(kupovnikurs);
		k.setProdajnikurs(prodajnikurs);
		k.setSrednjikurs(srednjikurs);
		e.setDatum(datum);
		e.setK(k);
		for (int i = 0; i < valute.size(); i++) {
			if (e.equals(valute.get(i)))
				return valute.get(i).getK();
		}

		return null;
	}

}
