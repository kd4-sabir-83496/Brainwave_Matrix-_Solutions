package com.brainwave.task2.Entity;

public class Invoice {

	int id;
	int patientId;
	double amount;
	
	public Invoice(int id, int pid, double amount) {
		
		this.id = id;
		this.patientId = pid;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", patientId=" + patientId + ", amount=" + amount + "]";
	}
}
