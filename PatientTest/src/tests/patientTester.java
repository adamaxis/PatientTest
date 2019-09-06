package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import patientTester.Patient;
import patientTester.PatientLogic;

public class patientTester {
	Patient tPatient = new Patient();
	PatientLogic patientInfo = new PatientLogic();
	
	@Before
	public void setUp() throws Exception {
		tPatient.setWeight(180.0); // 180 lbs
		tPatient.setHeight(72.0); // 6'0
	}
	
	@Test
	public void testConvertWeightToKg() {
		double kg = patientInfo.convertWeightToKg(tPatient);
		// check object integrity
		assertNotNull(tPatient);
		// should be 81.6, rounded down
		assertTrue(kg == 81.6);
	}
	
	@Test
	public void testConvertHeightToCm() {
		double cm = patientInfo.convertHeightToCm(tPatient);
		// check object integrity
		assertNotNull(tPatient);
		// should be 182.8, rounded down
		assertTrue(cm == 182.8);
	}
	
	@Test
	public void testCalculateBMI() {
		double bmi = patientInfo.calculateBMI(tPatient);
		// check object integrity
		assertNotNull(tPatient);
		// should be 24.4 - rounds down
		assertTrue(bmi == 24.4);
		assertFalse(bmi != 24.4);
	}

}
