package valute;

import java.util.GregorianCalendar;

public class Evro {

	private String ime;
	private String skracenica;
	private GregorianCalendar datum;
	private Kurs k;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime != null && ime != "")
			this.ime = ime;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		if (skracenica != null && skracenica != "")
			;
		this.skracenica = skracenica;
	}

	public Kurs getK() {
		return k;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public void setK(Kurs k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Evro [ime=" + ime + ", skracenica=" + skracenica + ", datum=" + datum + ", k=" + k + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((k == null) ? 0 : k.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
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
		if (k == null) {
			if (other.k != null)
				return false;
		} else if (!k.equals(other.k))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}

}
