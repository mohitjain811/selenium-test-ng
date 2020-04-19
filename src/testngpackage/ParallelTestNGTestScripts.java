package testngpackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/**
 * 
 * @author mohit
 *
 */
public class ParallelTestNGTestScripts {
	@Test(description="testNgCase1")
	  public void parallelTestScript1() {
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
	      WebDriver driverCD = new ChromeDriver();
	      String baseWebUrl = "https://www.google.com/";
	      driverCD.get(baseWebUrl);
	      Assert.assertEquals("Google", driverCD.getTitle());
	      driverCD.getTitle();
	      driverCD.close();
	  }
	  @Test(description="testNgCase2")
	  public void parallelTestScript2() {
		  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
	      WebDriver driverCD = new ChromeDriver();
	      String baseWebUrl = "https://www.facebook.com/";
	      driverCD.get(baseWebUrl);
	      Assert.assertEquals("Facebook - Log In or Sign Up", driverCD.getTitle());
	      driverCD.getTitle();
	      driverCD.close();
	  }
	  @Test(description="testNgCase3")
	  public void parallelTestScript3() {
		  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
	      WebDriver driverCD = new ChromeDriver();
	      String baseWebUrl = "https://www.linkedin.com/";
	      driverCD.get(baseWebUrl);
	      Assert.assertEquals("LinkedIn: Log In or Sign Up", driverCD.getTitle());
	      driverCD.getTitle();
	      driverCD.close();
	  }
	  @Test(description="testNgCase4")
	  public void parallelTestScript4() {
		  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
	      WebDriver driverCD = new ChromeDriver();
	      String baseWebUrl = "https://www.pinterest.ca/";
	      driverCD.get(baseWebUrl);
	      Assert.assertEquals("Pinterest", driverCD.getTitle());
	      driverCD.getTitle();
	      driverCD.close();
	  }
}
