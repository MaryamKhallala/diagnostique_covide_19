package com.diagnostic.model.service;

import java.util.ArrayList;

import com.diagnostic.model.bo.Responsable;

public class AlertResp {
	
	private ArrayList<Responsable> responsables;

	public AlertResp() {
		this.responsables =new ArrayList<>();
	}
	public void addResponsable(Responsable r)
	{
		this.responsables.add(r);
	}
	
	public void notifyResps() throws Exception {
		String email;
		for(Responsable resp: this.responsables) {
			email= resp.getMail();
			SendMail.sendMail(email);
		}
	}
	
	

}
