package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients;

	Doctor() {
		patients = new ArrayList<Patient>();
	}

	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws Exception {
		if(patients.size() >= 3) {
			throw new DoctorFullException("Doctor has too many patients");
		} else {
			patients.add(p);
		}
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		for (Patient p : patients) {
			p.checkPulse();
		}
	}
}
