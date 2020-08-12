package _04_hospital;

public class Patient {

	boolean feelsCaredFor;
	Patient(){
		feelsCaredFor = false;
	}

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}
	
}
