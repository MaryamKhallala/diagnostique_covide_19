package com.diagnostic.view;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.diagnostic.model.bo.Diagnostic;
import com.diagnostic.model.bo.Mesure;
import com.diagnostic.model.bo.Patient;
import com.diagnostic.model.bo.Symptome;
import com.diagnostic.model.dao.DAOPatient;

public class clientControlleur {
	private DAOPatient dao = new DAOPatient();
	
	public void VeriferPatient(String login, String password) {
		try{
			Patient p = null;
			if(!login.equals("")&&!password.equals(""))
				p = dao.findByLogin(login, password);
			if(p!=null) {
			FEspacePatient fs = new FEspacePatient(p);
			fs.setVisible(true);
			}
			else {
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"Incorrect Login or Password!","Add",JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception ex) {
			System.out.print(ex.toString()+"\nError");
		}
	}
	
	public void AjouterPatient(String nom, String prenom,Date date,String tel ,String login, String password) {
		try{
			JFrame f = new JFrame();
			Patient p = null;
			System.out.println("login =" +login.length());
			if(!login.equals("")&&!password.equals("")&&!nom.equals("")&&!prenom.equals("")) {
				if(dao.findByLogin(login)==null) {
					p = new Patient();
					p.setNom(nom);
					p.setPrenom(prenom);
					p.setLogin(login);
					p.setPassword(password);
					p.setDateNaiss(date);
					p.calculAge();
					p.setNumTele(tel);
					p.setRegion(null);
					p.setContactCovid19(false);
					System.out.println(p.getNom());
					dao.Create(p);
					FEspacePatient fs = new FEspacePatient(p);
					fs.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(f,"Login already exists!","Attention",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				
				JOptionPane.showMessageDialog(f,"Please fill all the necessary fields!","Add",JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception ex) {
			System.out.print(ex.toString()+"\nError");
		}
	}
}
