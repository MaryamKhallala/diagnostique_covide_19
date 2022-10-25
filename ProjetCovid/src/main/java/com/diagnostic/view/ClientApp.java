package com.diagnostic.view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.JFrame;

import com.diagnostic.model.bo.Diagnostic;
import com.diagnostic.model.bo.MaladieChronique;
import com.diagnostic.model.bo.Mesure;
import com.diagnostic.model.bo.Patient;
import com.diagnostic.model.bo.Region;
import com.diagnostic.model.bo.Symptome;
import com.diagnostic.model.bo.Ville;

public class ClientApp {
	
	private Socket socketEnd2 =null;
	private InputStream input = null;
	private OutputStream output = null;
	FDiagnostic frame = new FDiagnostic(null);
	  
	private static final int port = 3333;
	public ClientApp() {
		try {
			socketEnd2 = new Socket("localhost", port);
			input = socketEnd2.getInputStream();
			output = socketEnd2.getOutputStream();			
		}catch(Exception e) {}		
	}
	
	public double getResult(Patient p) throws IOException
	{	
		double result=0;
		try {
			// declaring an object Output stream for sending the data into the server 
				ObjectOutputStream oos = new ObjectOutputStream(output);
				System.out.println("Sending the object to the server ..");
				oos.writeObject(p);
				oos.flush();
				System.out.println("Closing socket and terminating program");
			// read the result : 
				DataInputStream dataInpt = new DataInputStream(input);
				result = dataInpt.readDouble();
				System.out.println("Votre degre de comptamination est : "+ result );
				
//				while (true) {
//				    try {
//				        Thread.sleep(1000);
//				    } catch(InterruptedException e) {
//				        e.printStackTrace();
//				    }
//				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public static void main(String[] args) throws IOException {
		
		
		
	}
	public  double getDegre(FDiagnostic f) throws Exception {
		frame = f;
		// lancer un new connextion avec le serveur 
		//
		//ystem.out.println(getResults().getDiagnostics(0).getListSymptomes());
		// send a request :
		f.hide();
		
    	String result = "     Degre de Contamination est ";
    	new FResultat(result+ getResult(getResults())).setVisible(true);
    	return 0;
	}
	
	public Patient getResults() {
		
		Patient p = new Patient();
   	    p.setNom("Karimi");
    	p.setPrenom("Ahmed");
    	p.setAge(30);
    	
    	Region r = new Region("region x");
    	r.setClassification("Haut");
    	Ville v = new Ville("Casa");
    	r.addVille(v);
    	p.setRegion(r);
		
    	//Patient p = frame.getPatient(); //getting patient from database
    	System.out.println(p.toString());
    	Diagnostic d = new Diagnostic();
		ArrayList<Symptome> s = new ArrayList<>();
		for(String symptome : frame.get_list_symptomes()) {
		  if(symptome.equals("fievre"))
		  {
			  s.add(new Symptome(symptome,new Mesure("Temperature",frame.Mesure())));
		  }
			 
		  else
		  {
			  s.add(new Symptome(symptome,null));
		  		System.out.println(symptome);
		  }
		  
		}
		for(String maladie: frame.get_list_maladie()) {
			p.addMaladieChroniques(new MaladieChronique(maladie,"maladie chronique"));
		}
		d.setSymptomes(s);
    	d.setDateHeure(new Date());
    	d.setDegreComptamination(0);
    	p.addDiagnostic(d);
    	p.setContactCovid19(frame.getContactCovid());
		return p;
		
	}
	
	
}
