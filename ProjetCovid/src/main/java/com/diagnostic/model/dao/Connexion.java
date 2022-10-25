package com.diagnostic.model.dao;
import com.mongodb.client.MongoDatabase;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Connexion {
	 
		public static DBCollection  getConnexionPatient()
		{
	      try {
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("Patient", "PatientDb", 
	         "Patient".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      @SuppressWarnings("deprecation")
	      DB database = mongo.getDB("PatientDb"); 
	      System.out.println("Credentials ::"+ credential);  
	      
	    //Creating a collection 
	      //database.createCollection("Diagnostic"); 
	      //System.out.println("Collection created successfully");
	      
	   // Retrieving a collection
		  	DBCollection collection = database.getCollection("Patient");
		  	System.out.println("Collection Patient selected successfully");
		  	return collection;
		  	
	      }
	      catch(Exception ex) {
	    	  ex.printStackTrace();
	    	  System.out.println("\nCollection Patient hasn't been selected successfully");
	    	  return null;
	      }
	
	   } 
		
		public static MongoCollection<Document> getConnexionDiagnostic()
		{
	      try {
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("Patient", "PatientDb", 
	         "Patient".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("PatientDb"); 
	      System.out.println("Credentials ::"+ credential);  
	      
	    //Creating a collection 
	      //database.createCollection("Ville"); 
	      //System.out.println("Collection created successfully");
	      
	   // Retrieving a collection
		  	MongoCollection<Document> collection = database.getCollection("Diagnostic");
		  	System.out.println("Collection Patient selected successfully");
		  	
		  	return collection;
	      }
	      catch(Exception ex) {
	    	  ex.printStackTrace();
	    	  System.out.println("\nCollection sampleCollection selected successfully");
	    	  return null;
	      }
	
	   }
		
		public static MongoCollection<Document> getConnexionVille()
		{
	      try {
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("Patient", "PatientDb", 
	         "Patient".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("PatientDb"); 
	      System.out.println("Credentials ::"+ credential);  
	      
	    //Creating a collection 
	      //database.createCollection("Ville"); 
	      //System.out.println("Collection created successfully");
	      
	   // Retrieving a collection
		  	MongoCollection<Document> collection = database.getCollection("Ville");
		  	System.out.println("Collection Patient selected successfully");
		  	
		  	return collection;
	      }
	      catch(Exception ex) {
	    	  ex.printStackTrace();
	    	  System.out.println("\nCollection sampleCollection selected successfully");
	    	  return null;
	      }
	
	   } 
}
