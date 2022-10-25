package com.diagnostic.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.text.Document;

import com.diagnostic.model.bo.*;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.util.JSON;

@SuppressWarnings("deprecation")
public class DAOPatient implements IDAOPatient{
	@Override
	public boolean Create(Patient P) {
		try{
			//retrieving collection
			DBCollection collection = Connexion.getConnexionPatient();
			Gson gson = new Gson();
			String json = gson.toJson(P);
			DBObject document = (DBObject) JSON.parse(json);
		  	//Inserting document into the collection
		  	collection.insert(document);
		  	System.out.println("Document inserted successfully");
		  	return true;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"error");
			return false;
		}
	}

	@Override
	public Collection<Patient> Retrieve() {
		try{
		Gson gson = new Gson();
		Collection<Patient> patients = new ArrayList<>();
		DBCollection collection = Connexion.getConnexionPatient();
		Iterator<DBObject> cursor = collection.find().iterator();
		
			while(cursor.hasNext()) {
				patients.add(gson.fromJson(cursor.next().toString(), Patient.class));
			}
		return patients;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"error");
			return null;
		}
	}

	@Override
	public boolean Update(Patient P) {
		try{
			Gson gson = new Gson();
			DBCollection collection = Connexion.getConnexionPatient();
			DBObject searchQuery = new BasicDBObject().append("login", P.getLogin());
			String json = gson.toJson(P);
			DBObject newDocument = (DBObject) JSON.parse(json);
			BasicDBObject updateObject = new BasicDBObject();
			updateObject.put("$set", newDocument); 
			collection.update(searchQuery, updateObject);
		    System.out.println( "Successfully updated the document");
			return true;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"\nError");
			return false;
		}
	}

	@Override
	public boolean Delete(Patient P) {
		try {
			DBCollection collection = Connexion.getConnexionPatient();
			DBObject document = new BasicDBObject("login",P.getLogin());
			collection.remove(document);
			System.out.println("Document deleted successfully");
			return true;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"error");
			return false;
		}
		
	}
	
	@Override
	public Patient findByLogin(String login) {
		try {
			Gson gson = new Gson();
			DBCollection collection = Connexion.getConnexionPatient();
			DBObject document = new BasicDBObject("login",login);
			DBObject obj = collection.findOne(document);
			Patient p = gson.fromJson(obj.toString(), Patient.class);
			return p;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"error");
			return null;
		}
	}
	@Override
	public Patient findByLogin(String login, String password) {
		try {
			Gson gson = new Gson();
			DBCollection collection = Connexion.getConnexionPatient();
			DBObject document = new BasicDBObject("login",login).append("password", password);
			DBObject obj = collection.findOne(document);
			Patient p = gson.fromJson(obj.toString(), Patient.class);
			return p;
		}catch(Exception ex) {
			System.out.print(ex.toString()+"error");
			return null;
		}
	}
	
	public void createIndex() {
		DBCollection collection = Connexion.getConnexionPatient();
		collection.createIndex(new BasicDBObject("login",1));
	}

	
}
