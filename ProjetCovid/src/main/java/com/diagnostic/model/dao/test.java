package com.diagnostic.model.dao;

import java.util.ArrayList;
import java.util.Date;

import com.diagnostic.model.bo.*;


public class test {

	public static void main(String[] args) {
		DAOPatient dao = new DAOPatient();
		Date dt = new Date();
		Region r = new Region("region x");
    	r.setClassification("Haut");
    	Ville v = new Ville("Casa");
    	r.addVille(v);
    	Diagnostic d = new Diagnostic();
		ArrayList<Symptome> s = new ArrayList<>();
		s.add(new Symptome("fievre",new Mesure("temperature",38)));
		d.setSymptomes(s);
		Diagnostic d1 = new Diagnostic();
		ArrayList<Symptome> s1 = new ArrayList<>();
		s.add(new Symptome("confusion",null));
		d.setSymptomes(s);
    	d.setDateHeure(new Date());
    	d.setDegreComptamination(0);
    	d1.setSymptomes(s1);
    	
		Patient p = new Patient("adam","lond",r,dt,"06569898","log","password");
		//p.addDiagnostic(d);
		//p.addDiagnostic(d1);
		p.setContactCovid19(true);
		p.setAge(30);
		//p.addMaladieChroniques(new MaladieChronique("diabetique","maladie chronique"));
		dao.Create(p);
//		dao.createIndex();
		//dao.Delete(p);
		//dao.Retrieve();
		//Patient pp = dao.findByLogin("login");
		//System.out.println(pp.toString());
		//dao.Update(p);
	}
}
