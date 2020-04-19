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
public class MyFirstTestNG {
  @Test
  public void test1() {
	  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
      WebDriver driverCD = new ChromeDriver();
      String baseWebUrl = "https://www.google.com/";
      driverCD.get(baseWebUrl);
      Assert.assertEquals("Google", driverCD.getTitle());
      driverCD.getTitle();
      driverCD.close();
  }
  @Test
  public void test2() {
	  System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
      WebDriver driverCD = new ChromeDriver();
      String baseWebUrl = "https://www.facebook.com/";
      driverCD.get(baseWebUrl);
      Assert.assertEquals("Facebook - Log In or Sign Up", driverCD.getTitle());
      driverCD.getTitle();
      driverCD.close();
  }
}
