package com.diagnostic.model.bo;

import java.io.Serializable;

public class Mesure implements Serializable{
	
	private static int compt;
	private int id;
	private String nom;
	private float valeur;
	
	
	
	public Mesure( String nom, float valeur) {
		super();
		compt++;
		this.id = compt;
		this.nom = nom;
		this.valeur = valeur;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Mesure [nom=" + nom + ", valeur=" + valeur + "]";
	}
	
	
}
