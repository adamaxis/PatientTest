package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// test runner, which will run all tests within PatientTester + PatientBMITester
// this isn't necessary, but I left it in just to demonstrate it
public class TestRunner {
	public static void main(String[] args) {
		// execute our PatientTester tests
		Result result = JUnitCore.runClasses(PatientTester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		// now execute PatientBMITester tests
		result = JUnitCore.runClasses(PatientBMITester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
