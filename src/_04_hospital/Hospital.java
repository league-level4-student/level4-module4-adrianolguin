package _04_hospital;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();	
	
	Hospital() {
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = i * 3; j < patients.size(); j++) {
				try {
					doctors.get(i).assignPatient(patients.get(j));
				} catch (Exception e) {
				}
			}
		}
	}

}
