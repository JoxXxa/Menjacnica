package valute;

import java.util.GregorianCalendar;

public class Kurs {

	private double prodajnikurs;
	private double srednjikurs;
	private double kupovnikurs;

	public Kurs(double prodajnikurs, double kupovnikurs, double srednjikurs) {
		super();
		this.prodajnikurs = prodajnikurs;
		this.kupovnikurs = kupovnikurs;
		this.srednjikurs = srednjikurs;
	}

	public double getProdajnikurs() {
		return prodajnikurs;
	}

	public void setProdajnikurs(double prodajnikurs) {
		if (prodajnikurs > 0)
			this.prodajnikurs = prodajnikurs;
	}

	public double getKupovnikurs() {
		return kupovnikurs;
	}

	public void setKupovnikurs(double kupovnikurs) {
		if (kupovnikurs > 0)
			this.kupovnikurs = kupovnikurs;
	}

	public double getSrednjikurs() {
		return srednjikurs;
	}

	public void setSrednjikurs(double srednjikurs) {
		if (srednjikurs > 0)
			this.srednjikurs = srednjikurs;
	}

	@Override
	public String toString() {
		return "Kurs [prodajnikurs=" + prodajnikurs + ", kupovnikurs=" + kupovnikurs + ", srednjikurs=" + srednjikurs
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovnikurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajnikurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (Double.doubleToLongBits(kupovnikurs) != Double.doubleToLongBits(other.kupovnikurs))
			return false;
		if (Double.doubleToLongBits(prodajnikurs) != Double.doubleToLongBits(other.prodajnikurs))
			return false;
		if (Double.doubleToLongBits(srednjikurs) != Double.doubleToLongBits(other.srednjikurs))
			return false;
		return true;
	}

}
