package _04_hospital;

public class GeneralPractitioner extends Doctor {

	GeneralPractitioner() {

	}

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return true;
	}
}
