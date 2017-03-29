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

	@Override
	public String toString() {
		return "Evro [ime=" + ime + ", skracenica=" + skracenica + ", datum=" + datum + ", prodajnikurs=" + prodajnikurs
				+ ", kupovnikurs=" + kupovnikurs + ", srednjikurs=" + srednjikurs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovnikurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajnikurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednjikurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evro other = (Evro) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (Double.doubleToLongBits(kupovnikurs) != Double.doubleToLongBits(other.kupovnikurs))
			return false;
		if (Double.doubleToLongBits(prodajnikurs) != Double.doubleToLongBits(other.prodajnikurs))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		if (Double.doubleToLongBits(srednjikurs) != Double.doubleToLongBits(other.srednjikurs))
			return false;
		return true;
	}
	
	

}
