package com.diagnostic.model.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient implements Serializable{
	
	private static int compt;
	private int id;
	private String nom;
	private String prenom;
	private Region region;
	private Date DateNaiss;
	private int age;
	private String numTele;
	private String login;
	private String password;
	private boolean contactCovid19;
	private ArrayList<Diagnostic> diagnostics;
	private ArrayList<MaladieChronique> MaladieChroniques;
	
	public Patient() {
		this.diagnostics = new ArrayList<>();
		this.MaladieChroniques = new ArrayList<>();
	}
	

	public Patient(String nom, String prenom, Region region, Date datenaiss, String numTele, String login, String password) {
		super();
		compt++;
		this.id = compt;
		this.nom = nom;
		this.prenom = prenom;
		this.numTele = numTele;
		this.DateNaiss = datenaiss;
		this.login = login;
		this.password = password;
		this.diagnostics = new ArrayList<>();
		this.MaladieChroniques = new ArrayList<>();
		this.region = region;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<MaladieChronique> getMaladieChroniques() {
		return MaladieChroniques;
	}

	public void setMaladieChroniques(ArrayList<MaladieChronique> maladieChroniques) {
		MaladieChroniques = maladieChroniques;
	}
	
	public void addMaladieChroniques(MaladieChronique m)
	{
		this.MaladieChroniques.add(m);
	}

	public Region getRegion() {
		return this.region;
	}


	public void setRegion(Region region) {
		this.region = region;
	}


	@SuppressWarnings("deprecation")
	public void calculAge() {
		Date dt = new Date();
		System.out.println(dt.getYear()+" hghjg"+this.DateNaiss.getYear());
		this.setAge(dt.getYear()-DateNaiss.getYear()); 
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Diagnostic> getDiagnostics() {
		return diagnostics;
	}
	public Diagnostic getDiagnostics(int id) {
		return diagnostics.get(id);
	}
	public void setDiagnostics(ArrayList<Diagnostic> diagnostics) {
		this.diagnostics = diagnostics;
	}

	public void addDiagnostic(Diagnostic d)
	{
		this.diagnostics.add(d);
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumTele() {
		return numTele;
	}

	public void setNumTele(String numTele) {
		this.numTele = numTele;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public Date getDateNaiss() {
		return DateNaiss;
	}


	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}


	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + ", region=" + region + ", DateNaiss=" + DateNaiss + ", age="
				+ age + ", numTele=" + numTele + ", login=" + login + ", password=" + password + ", contactCovid19="
				+ contactCovid19 + ", diagnostics=" + diagnostics + ", MaladieChroniques=" + MaladieChroniques + "]";
	}


	public boolean getContactCovid19() {
		return contactCovid19;
	}

	public void setContactCovid19(boolean contactCovid19) {
		this.contactCovid19 = contactCovid19;
	}
	
	
	
	
}
