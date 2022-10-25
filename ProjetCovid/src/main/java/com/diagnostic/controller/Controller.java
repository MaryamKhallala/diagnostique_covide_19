package com.diagnostic.controller;

import java.util.ArrayList;
import java.util.Date;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.diagnostic.model.bo.*;
import com.diagnostic.model.service.AlertResp;

public class Controller {
	
	public static final double traitement(Patient p) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	AlertResp AR = new AlertResp();
        	Responsable R = new Responsable("Gmail","projetilisi@gmail.com");
        	AR.addResponsable(R);
        	kSession.insert(AR);
        	kSession.insert(p);
            kSession.fireAllRules();           
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return p.getDiagnostics().get(0).getDegreComptamination();
    }
}
