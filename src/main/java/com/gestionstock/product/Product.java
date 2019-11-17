package com.gestionstock.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
    private int id;
    private String nom;
    private int prixunitaire;
    private int quantite;
    
    
    public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String nom, int prixunitaire, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixunitaire = prixunitaire;
		this.quantite = quantite;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getPrixunitaire() {
		return prixunitaire;
	}


	public void setPrixunitaire(int prixunitaire) {
		this.prixunitaire = prixunitaire;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", nom=" + nom + ", prixunitaire=" + prixunitaire + ", quantite=" + quantite + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}


    
}

