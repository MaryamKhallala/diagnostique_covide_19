package com.diagnostic.model.bo;

import java.io.Serializable;

public class Maladie implements Serializable{
	
	private static int compt;
	private int id;
	private String nomMalCh;
	private String Description;
	
	public Maladie(String nomMalCh, String description) {
		this.id =compt++;
		this.nomMalCh = nomMalCh;
		Description = description;
	}

	public String getNomMalCh() {
		return nomMalCh;
	}

	public void setNomMalCh(String nomMalCh) {
		this.nomMalCh = nomMalCh;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	
	
}
