package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

class EncapsulateDataTests {
	EncapsulateTheData machine = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		int test1 = 10;
		int test2 = -10;
		machine.setItemsReceived(test1);
		assertEquals(test1, machine.getItemsReceived());

		machine.setItemsReceived(test2);
		assertEquals(0, machine.getItemsReceived());
	}

	@Test
	public void testDegreesTurned() {
		int test1 = 45;
		int test2 = -10;
		int test3 = 400;

		machine.setDegreesTurned(test1);
		assertEquals(test1, machine.getDegreesTurned());
		
		machine.setDegreesTurned(test2);
		assertEquals(0, machine.getDegreesTurned());
		
		machine.setDegreesTurned(test3);
		assertEquals(360, machine.getDegreesTurned());
	}

	@Test
	public void testNomenclature() {
		String test1 = "Hello";
		String test2 = "";

		machine.setNomenclature(test1);
		assertEquals(test1, machine.getNomenclature());

		machine.setNomenclature(test2);
		assertEquals(" ", machine.getNomenclature());
	}

	@Test
	public void testMemberObj() {
		int test1 = 10;
		String test2 = "test";
		
		machine.setMemberObj(test1);
		assertEquals(test1, machine.getMemberObj());
		
		machine.setMemberObj(test2);
		assertEquals(new Object().getClass(), machine.getMemberObj());
	}
	
}

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			this.itemsReceived = 0;
		} else {
			this.itemsReceived = itemsReceived;
		}
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {

		if (degreesTurned > 360) {
			this.degreesTurned = 360;
		} else if (degreesTurned < 0) {
			this.degreesTurned = 0;
		} else {
			this.degreesTurned = degreesTurned;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.contentEquals("")) {
			this.nomenclature = " ";
		} else {
			this.nomenclature = nomenclature;
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if(memberObj.getClass().equals(String.class)){
			this.memberObj = new Object();
		} else {
			this.memberObj = memberObj;
		}
	}

}
