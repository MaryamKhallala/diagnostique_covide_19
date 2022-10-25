package com.diagnostic.model.dao;

import java.util.Collection;

import com.diagnostic.model.bo.Patient;

public interface IDAOPatient {
	 boolean Create(Patient P);
	 Collection<Patient> Retrieve();
	 boolean Update(Patient P);
	 boolean Delete(Patient P);
	 Patient findByLogin(String login, String password);
	 Patient findByLogin(String login);
}
