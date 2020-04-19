package testngpackage;

import java.util.*;
import org.testng.*;
import org.testng.xml.XmlSuite;
/**
 * 
 * @author mohit
 *
 */
public class TestNGReporterInterface implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuite, List<ISuite> suite, String outputDir) {
		/* suite contains the information about the executed suite. */
		for (ISuite iSuite : suite) {
			Map<String, ISuiteResult> testSetResult = iSuite.getResults();

			/* Get the key set from the result map */
			Set<String> keys = testSetResult.keySet();
			
			for (String key : keys) {
				ITestContext resTestNGContext = testSetResult.get(key).getTestContext();
				// Print Suite detail in Console
				System.out.println("The Test Suite:->" + resTestNGContext.getName() + ":: The Report output Dir:->"
						+ resTestNGContext.getOutputDirectory() + "::Test Suite:->" + resTestNGContext.getSuite().getName()
						+ "::The Start Date Time:->" + resTestNGContext.getStartDate() + "::The End Date Time:->"
						+ resTestNGContext.getEndDate());
				
				/*Get Failed Test Cases */
				IResultMap failedResultMap = resTestNGContext.getFailedTests();
				Collection<ITestNGMethod> failedTestNGMethods = failedResultMap.getAllMethods();
				
				System.out.println("--------THE TEST CASE HAS FAILED---------");
				
				for (ITestNGMethod resTestNGMethod : failedTestNGMethods) {
					System.out.println(" The Test Case:->" + resTestNGMethod.getMethodName() + "\nDetail as follows:->"
							+ resTestNGMethod.getDescription() + "\nTest Priority:->" + resTestNGMethod.getPriority()
							+ "\n:Test Date:->" + new Date(resTestNGMethod.getDate()));
				}

			}
		}
	}
}