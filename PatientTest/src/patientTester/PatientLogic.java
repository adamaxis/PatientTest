package patientTester;
import java.lang.Math;

/**
 * 
 * @author The Dude
 * PatientLogic - handles patient manipulation functions
 */
public class PatientLogic {
	/**
	 * @param patient Patient being considered
	 * @return height Patient height (in CM) rounded down to nearest tenth
	 */
	public double convertHeightToCm(Patient patient) {
		double cm = patient.height * 2.54;
		return Math.floor(cm * 10.0) / 10.0;
	}
	
	/**
	 * 
	 * @param patient Patient being considered
	 * @return weight Patient weight (in KG) rounded down to nearest tenth
	 */
	public double convertWeightToKg(Patient patient) {
		Double kg = (patient.weight * 0.45359237);
		return Math.floor(kg * 10.0) / 10.0;
		
	}
	
	/**
	 * 
	 * @param patient Patient being considered
	 * @return Patient BMI, rounded down to nearest tenth
	 */
	public double calculateBMI(Patient patient) {
		Double bmi = (convertWeightToKg(patient) / (Math.pow(convertHeightToCm(patient), 2) / 10000));
		return Math.floor(bmi * 10.0) / 10.0;
	}
}
