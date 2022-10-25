package com.diagnostic.model.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diagnostic implements Serializable{
	
	private int id;
	private static int compt;
	private double degreComptamination;
	private Date dateHeure;
	private ArrayList<Symptome> symptomes;
	
	
	public Diagnostic() {
		this.symptomes = new ArrayList<>();
	}
	public Diagnostic( float degreComptamination, Date dateHeure) {
		super();
		compt++;
		this.id = compt;
		this.degreComptamination = degreComptamination;
		this.dateHeure = dateHeure;
		this.symptomes = new ArrayList<>();
	}
	
	public void addSymptome(Symptome s)
	{
		this.symptomes.add(s);
	}
	public ArrayList<Symptome> getSymptomes() {
		return symptomes;
	}

	public void setSymptomes(ArrayList<Symptome> symptomes) {
		this.symptomes = symptomes;
	}
	public double getDegreComptamination() {
		return degreComptamination;
	}
	public void setDegreComptamination(double degreComptamination) {
		this.degreComptamination = degreComptamination;
	}
	public Date getDateHeure() {
		return dateHeure;
	}
	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}
	
	public List<String> getListSymptomes()
	{
		List<String> liste = new ArrayList<>();
		for(Symptome s : symptomes)
		{
			liste.add(s.getDesignation());
		}
		return liste;
	}
	@Override
	public String toString() {
		return "Diagnostic [id=" + id + ", degreComptamination=" + degreComptamination + ", dateHeure=" + dateHeure
				+ ", symptomes=" + symptomes.toString() + "]";
	}
	
}
