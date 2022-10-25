package com.diagnostic.model.service;

public class ClassAide {
	
	float poursNbCas;
	float poursNbGueris;
	float poursNbDeces;
	public ClassAide(float poursNbCas, float poursNbGueris, float poursNbDece) {
		super();
		this.poursNbCas = poursNbCas;
		this.poursNbGueris = poursNbGueris;
		this.poursNbDeces = poursNbDece;
	}
	@Override
	public String toString() {
		return "ClassAide [poursNbCas=" + poursNbCas + ", poursNbGueris=" + poursNbGueris + ", poursNbDeces="
				+ poursNbDeces + "]";
	}

}