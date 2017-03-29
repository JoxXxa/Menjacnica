package razmena;

import java.util.GregorianCalendar;

import valute.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodavanjeKursa(GregorianCalendar datum,Kurs kurs );
	public void brisanjeKursa(GregorianCalendar datum);
	public Kurs pretragaKursa(GregorianCalendar datum,Kurs k);
}
