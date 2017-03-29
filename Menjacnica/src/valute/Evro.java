package valute;

import java.util.GregorianCalendar;

public class Evro {
	public String ime;
	public String skracenica;
	public GregorianCalendar datum;
	public double prodajnikurs, kupovnikurs, srednjikurs;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public double getProdajni() {
		return prodajnikurs;
	}

	public void setProdajni(double prodajnikurs) {
		this.prodajnikurs = prodajnikurs;
	}

	public double getKupovni() {
		return kupovnikurs;
	}

	public void setKupovni(double kupovnikurs) {
		this.kupovnikurs = kupovnikurs;
	}

	public double getSrednji() {
		return srednjikurs;
	}

	public void setSrednji(double srednjikurs) {
		this.srednjikurs = srednjikurs;
	}

}
