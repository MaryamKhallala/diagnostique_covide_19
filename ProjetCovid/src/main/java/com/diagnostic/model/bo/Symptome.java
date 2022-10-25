package com.diagnostic.model.bo;

import java.io.Serializable;

public class Symptome implements Serializable{
	
	private int id;
	private static int compt=1;
	private String designation;
	private Mesure mesure;
	
	
	
	
	public Symptome(String designation, Mesure mesure) {
		super();
		compt++;
		this.id = compt;
		this.designation = designation;
		this.mesure = mesure;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Mesure getMesure() {
		return mesure;
	}

	public void setMesure(Mesure mesure) {
		this.mesure = mesure;
	}

	@Override
	public String toString() {
		return "Symptome [id=" + id + ", designation=" + designation + ", mesure="; //+ mesure.toString() + "]";
	}
	
	

}
