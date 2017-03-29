package razmena;

import java.util.GregorianCalendar;

import valute.Kurs;

public interface MenjacnicaInterfejs {

	public void dodavanjeKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica);

	public void brisanjeKursa(GregorianCalendar datum, String ime, String skracenica);

	public Kurs pretragaKursa(GregorianCalendar datum, double srednjikurs, double prodajnikurs, double kupovnikurs,
			String ime, String skracenica);
}
