package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// AllTests, which does the same thing as TestRunner but with a suite instead

@RunWith(Suite.class)
@SuiteClasses({ PatientBMITester.class, PatientTester.class })
public class AllTests {

}
