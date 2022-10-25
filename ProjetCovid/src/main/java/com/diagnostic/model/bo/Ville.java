package com.diagnostic.model.bo;

import java.io.Serializable;
import java.util.*;
public class Ville implements Serializable{
	
	private static int id;
	private int compt;
	private String nomVille;
	private float niveauParVille;
	
	public Ville(String nomVille) {
		compt++;
		this.id = compt;
		this.nomVille = nomVille;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public Ville(float niveauParVille) {
		super();
		this.niveauParVille = niveauParVille;
	}
	
	// method de calcul de niveau par ville
	

}
