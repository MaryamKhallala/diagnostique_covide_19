package com.diagnostic.serveur;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.diagnostic.controller.Controller;
import com.diagnostic.model.bo.Patient;

public class ServerApp extends Thread{
	
	Controller cn = new Controller();
	int nombrePat;
	@Override
	public void run() {
		
		try {
			System.out.println("Server start ....");
			ServerSocket ss = new ServerSocket(3333);
			System.out.println("Server started!");
			while(true)
			{
				System.out.println("Attente de demande ....");
				Socket s = ss.accept();
				nombrePat++;
				new Conversation(s,nombrePat).start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	class Conversation extends Thread {
		private Socket sock;
		private int numPat;
		public Conversation(Socket sock,int numPat)
		{
			this.sock = sock;
			this.numPat = numPat;
		}
		
		@Override
		public void run() {
			
			try {
				
				InputStream input = sock.getInputStream();
				OutputStream output = sock.getOutputStream();
				ObjectInputStream ois = new ObjectInputStream(input);
				Patient p = (Patient) ois.readObject();
				System.out.println("Bienvenue Patient  : " + numPat);
				
				// sending the result : degree de comptamination :
				DataOutputStream dataOuSt = new DataOutputStream(output);
				dataOuSt.writeDouble(cn.traitement(p));
				dataOuSt.flush();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();	
			}catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new ServerApp().start();
	}

}
