package com.diagnostic.model.service;


import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;    


public class SendMail{  
	private static boolean send=false;
	public static void main(String args[]){
			 try {
				sendMail("projetilisi@gmail.com");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	@SuppressWarnings("restriction")
	public static void sendMail(String recepient) throws Exception {
			if(!send) {   
			System.out.println("Preparing to send email");
	        Properties properties = System.getProperties();
	        
	        //Enable authentication
	        properties.put("mail.smtp.auth", "true");
	        //Set TLS encryption enabled
	        properties.put("mail.smtp.starttls.enable", "true");
	        //Set SMTP host
	        properties.put("mail.smtp.host", "smtp.gmail.com");
	        //Set smtp port
	        properties.put("mail.smtp.port", "587");
	        // ssl Protocole
	        //properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

	        //Your gmail address
	        String myAccountEmail = "projetilisi@gmail.com";
	        //Your gmail password
	        String password = "ilisi@2022";

	        //Create a session with account credentials
	        Session session = Session.getInstance(properties, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(myAccountEmail, password);
	            }
	        });

	        //Prepare email message
	        MimeMessage message = prepareMessage(session, myAccountEmail, recepient);

	        //Send mail
	        Transport.send(message);
	        System.out.println("Message sent successfully");
	        send = true;
	        }
	    }

	@SuppressWarnings("restriction")
	private static  MimeMessage prepareMessage(Session session, String myAccountEmail, String recepient) {
	        try {
	        	MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(myAccountEmail));
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
	            message.setSubject("Diagnostic Covid19!");
	            message.setText("Covid 19 case detected");
	            //String htmlCode = "<h1> WE LOVE JAVA </h1> <br/> <h2><b>Next Line </b></h2>";
	           // message.setContent(htmlCode, "text/html");
	            return message;
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }
	        return null;
	    }

} 