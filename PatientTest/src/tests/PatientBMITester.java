package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import patientTester.Patient;
import patientTester.PatientLogic;

public class PatientBMITester {
	Patient tPatient = new Patient();
	PatientLogic patientInfo = new PatientLogic();
	
	@Before
	public void setUp() throws Exception {
		tPatient.setWeight(180.0); // 180 lbs
		tPatient.setHeight(72.0); // 6'0
	}
	@Test
	public void test() {
		double bmi = patientInfo.calculateBMI(tPatient);
		// check object integrity
		assertNotNull(tPatient);
		// should be 24.4 - rounds down
		assertTrue(bmi == 24.4);
		assertFalse(bmi != 24.4);
	}
}
