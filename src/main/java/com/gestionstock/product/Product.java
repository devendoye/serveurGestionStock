package com.gestionstock.product;

public class Product {
	
	private String  ref;
	private  int prixunitaire;
	private int qte;
	public Product() {
		super();
	}
	public Product(String ref, int prixunitaire, int qte) {
		super();
		this.ref = ref;
		this.prixunitaire = prixunitaire;
		this.qte = qte;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getPrixunitaire() {
		return prixunitaire;
	}
	public void setPrixunitaire(int prixunitaire) {
		this.prixunitaire = prixunitaire;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
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
		Product other = (Product) obj;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	
	

}
