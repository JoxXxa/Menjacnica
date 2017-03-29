package valute;

public class Kurs {

	public Kurs(double prodajnikurs, double kupovnikurs, double srednjikurs) {
		super();
		this.prodajnikurs = prodajnikurs;
		this.kupovnikurs = kupovnikurs;
		this.srednjikurs = srednjikurs;
	}

	public double prodajnikurs, kupovnikurs, srednjikurs;

	public double getProdajnikurs() {
		return prodajnikurs;
	}

	public void setProdajnikurs(double prodajnikurs) {
		this.prodajnikurs = prodajnikurs;
	}

	public double getKupovnikurs() {
		return kupovnikurs;
	}

	public void setKupovnikurs(double kupovnikurs) {
		this.kupovnikurs = kupovnikurs;
	}

	public double getSrednjikurs() {
		return srednjikurs;
	}

	public void setSrednjikurs(double srednjikurs) {
		this.srednjikurs = srednjikurs;
	}

	@Override
	public String toString() {
		return "Kurs [prodajnikurs=" + prodajnikurs + ", kupovnikurs=" + kupovnikurs + ", srednjikurs=" + srednjikurs
				+ ", getProdajnikurs()=" + getProdajnikurs() + ", getKupovnikurs()=" + getKupovnikurs()
				+ ", getSrednjikurs()=" + getSrednjikurs() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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
