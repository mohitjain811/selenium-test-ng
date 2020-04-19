package testngpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 /**
  * 
  * @author mohit
  *
  */
public class TestNGITestListenerReport implements ITestListener{
    @Override
    public void onStart(ITestContext arg) {
         System.out.println("The test Execution has started->"+arg.getName());
    }
    @Override
    public void onTestStart(ITestResult arg) {
        System.out.println("the test has Started->"+arg.getName());
    }
    @Override
    public void onTestSuccess(ITestResult arg) {
        System.out.println("the test has Passed->"+arg.getName());
    }
    @Override
    public void onTestFailure(ITestResult arg) {
        System.out.println("The test has Failed->"+arg.getName());
    }
    @Override
    public void onTestSkipped(ITestResult arg) {
        System.out.println("The test was Skipped->"+arg.getName());
    }
    @Override
    public void onFinish(ITestContext arg) {
    	System.out.println("The test Execution has ended->"+arg.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        // TODO Auto-generated method stub
    }
}