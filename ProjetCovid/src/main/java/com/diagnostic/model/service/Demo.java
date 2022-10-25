package com.diagnostic.model.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Demo {

	public static void main(String[] args) {
		
		try {
			
			Document doc = Jsoup.connect("https://covid.hespress.com/").get();
			
			System.out.println(doc.title());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
