package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

import org.junit.Test;

// test runner, which will run all tests within PatientTester + PatientBMITester
// this isn't necessary, but I left it in just to demonstrate it
public class TestRunner {
	public static void main(String[] args) {
		// execute our PatientTester tests
		Result result = JUnitCore.runClasses(PatientTester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if(!result.wasSuccessful()) {
			fail("PatientTester failed some tests.");
		}
		// now execute PatientBMITester tests
		result = JUnitCore.runClasses(PatientBMITester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if(!result.wasSuccessful()) {
			fail("PatientBMITester failed some tests.");
		}
			System.out.println("PatientTester+PatientBMITester tests executed successfully");
	}

}
