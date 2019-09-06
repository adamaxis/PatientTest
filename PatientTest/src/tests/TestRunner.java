package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
// test runner, which will run everything
public class TestRunner {
	public static void main(String[] args) {
		// execute our tests
		Result result = JUnitCore.runClasses(PatientTester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
