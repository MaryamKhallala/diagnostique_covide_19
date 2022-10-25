package com.diagnostic.model.bo;

public class Responsable {
	
	private static int compt;
	private int id;
	private String nomSociete;
	private String mail;
	
	public Responsable(String nomSociete, String mail) {
		super();
		compt++;
		this.id=compt;
		this.nomSociete = nomSociete;
		this.mail = mail;
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
