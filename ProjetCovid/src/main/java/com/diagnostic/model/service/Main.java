package com.diagnostic.model.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
	
	
	static ArrayList<Float>  nombrePopulParRegion = new ArrayList<>();
	static ArrayList<ClassAide> poursPerRegion = new ArrayList<>();

public static void main(String[] args) {
		
		nombrePopulParRegion.add((float) 7408213); // casa
		 nombrePopulParRegion.add((float) 1693786); // draa tafilalet
		 nombrePopulParRegion.add((float) 1693786); // edakhla oued eddahab
		 nombrePopulParRegion.add((float) 446225);  // oued noun
		 nombrePopulParRegion.add((float) 388902); // laayoune
		 nombrePopulParRegion.add((float) 2581703); //beni mellal
		 nombrePopulParRegion.add((float) 4687947 ); // merrakesh
		 nombrePopulParRegion.add((float) 4769423); // rabat salé
		 nombrePopulParRegion.add((float) 2817204); // sous massa
		 nombrePopulParRegion.add((float) 4347958); // fes meknes
		 nombrePopulParRegion.add((float) 3725192); // tanger 
		 nombrePopulParRegion.add((float) 2402374); // oriental
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://services3.arcgis.com/hjUMsSJ87zgoicvl/arcgis/rest/services/Covid_19/FeatureServer/0/query?where=1%3D1&outFields=Cases,Deaths,Nom_R%C3%A9gion_FR,Nom_R%C3%A9gion_AR,Recoveries&outSR=4326&f=json")).build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			.thenApply(HttpResponse::body)
			.thenApply(Main::parseArr)
			.join();
		
		 
		 
		 
		 
//		for(int i=0;i<poursPerRegion.size();i++)
//		{
//			//System.out.println(poursPerRegion.get(i));
//		}
		 
	}
	
	
	
	
	public static String parseArr(String responseBody)
	{
		
		 JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(responseBody);
		
		 JSONArray infoCovid = jsonObj.getJSONArray("features");
		 
		 for(int i=0;i<infoCovid.length();i++)
		 {
			 JSONObject c = infoCovid.getJSONObject(i);
			 
			 JSONObject c_fils = c.getJSONObject("attributes");
			 
			 int cases = c_fils.getInt("Cases");
			 int deaths = c_fils.getInt("Deaths");
			 String nomRegionFr = c_fils.getString("Nom_Région_FR");
			 int recoveries = c_fils.getInt("Recoveries"); 
			 
			 
			 
			 poursPerRegion.add(new ClassAide(Main.CalculPoursNbCasPos(nombrePopulParRegion.get(i), cases), Main.CalculPoursNbGueris(cases, recoveries),Main.CalculPoursNbDeces(cases, deaths)));
			 
			 System.out.println(poursPerRegion.get(i));
			 System.out.println( "Dans la région : " + nomRegionFr + " - " + " avec un nombre de cases : " + cases  + " - nombre de décès : " + deaths + " - recoveris " + recoveries);
			 
		 }
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return null;
		
	}
	
	public static String parse(String responseBody) throws JSONException
	{
		
		JSONArray albums  = new JSONArray(responseBody);
		for(int i=0;i<albums.length();i++)
		{
			JSONObject album = albums.getJSONObject(i);
			int id=album.getInt("id");
			int userId = album.getInt("userId");
			String title = album.getString("title");
			
			// ajout dans la base de donnée :
			
			System.out.println(id + " : " + title + " , userId : " + userId);
		}
		
		return null;
	}
	
	public static float CalculPoursNbCasPos( float nombrePop,int cases)
	{
		 return (cases*100)/nombrePop ;
	}
	
	public static float CalculPoursNbDeces( int cases,int nbDeces)
	{
		 return (nbDeces*100)/(float)cases ;
	}
	public static float CalculPoursNbGueris( int cases,int nbGueris)
	{
		 return (nbGueris*100)/(float)cases ;
	}
	
	

}
