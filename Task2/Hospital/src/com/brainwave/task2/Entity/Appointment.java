package com.brainwave.task2.Entity;

public class Appointment {

	 int id;
	    int patientId;
	    int doctorId;
	    String date;

	    public Appointment(int id, int pid, int did, String date) {
	        this.id = id;
	        this.patientId = pid;
	        this.doctorId = did;
	        this.date = date;
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

		public int getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Appointment [id=" + id + ", patientId=" + patientId + ", doctorId=" + doctorId + ", date=" + date
					+ "]";
		}


}
