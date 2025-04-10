package com.brainwave.task2.Entity;

public class Patient {
	int id;
	String name;
	String contacts;
	String diagnosis;
	
	public Patient(int id, String name, String contacts, String diagnosis) {
		this.id = id;
		this.name = name;
		this.contacts = contacts;
		this.diagnosis = diagnosis;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
+
	public void setName(String name) {
		this.name = name;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", contacts=" + contacts + ", diagnosis=" + diagnosis + "]";
	}
}
