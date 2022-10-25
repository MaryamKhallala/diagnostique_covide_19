package com.diagnostic.model.bo;

import java.io.Serializable;
import java.util.ArrayList;

public class Region implements Serializable{
	
	private static int compt;
	private int id;
	private String nomRegion;
	private float poursNiveau;
	private String classification;
	private ArrayList<EtatEvolution> etats;
	private ArrayList<Ville> villes;
	
	
	public Region(String nomRegion) {
		compt++;
		this.id=compt;
		this.nomRegion = nomRegion;
		this.villes =new ArrayList<>();
		this.etats = new ArrayList<>();
	}
	public void addVille(Ville v)
	{
		this.villes.add(v);
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public float getPoursNiveau() {
		return poursNiveau;
	}

	public void setPoursNiveau(float poursNiveau) {
		this.poursNiveau = poursNiveau;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public ArrayList<EtatEvolution> getEtats() {
		return etats;
	}
	public void setEtats(ArrayList<EtatEvolution> etats) {
		this.etats = etats;
	}
	public ArrayList<Ville> getVilles() {
		return villes;
	}
	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}
	
	public void addEtat(EtatEvolution e) {
		this.etats.add(e);
	}
	
	// method de calcul pour le niveau :
	
	

}
