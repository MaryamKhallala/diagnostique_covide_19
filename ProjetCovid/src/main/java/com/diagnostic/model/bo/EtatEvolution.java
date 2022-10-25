package com.diagnostic.model.bo;

import java.util.Date;

public class EtatEvolution {
	
	
	private static int compt;
	private int id;
	private int nombreComntamine;
	private int nombreGueris;
	private int nombreDeces;
	private Date date;
	
	public EtatEvolution(int nombreComntamine, int nombreGueris, int nombreDeces, Date date) {
		super();
		this.nombreComntamine = nombreComntamine;
		this.nombreGueris = nombreGueris;
		this.nombreDeces = nombreDeces;
		this.date = date;
	}

	public int getNombreComntamine() {
		return nombreComntamine;
	}

	public void setNombreComntamine(int nombreComntamine) {
		this.nombreComntamine = nombreComntamine;
	}

	public int getNombreGueris() {
		return nombreGueris;
	}

	public void setNombreGueris(int nombreGueris) {
		this.nombreGueris = nombreGueris;
	}

	public int getNombreDeces() {
		return nombreDeces;
	}

	public void setNombreDeces(int nombreDeces) {
		this.nombreDeces = nombreDeces;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
