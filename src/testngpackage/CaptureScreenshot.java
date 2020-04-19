package testngpackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/**
 * 
 * @author mohit
 *
 */
public class CaptureScreenshot {
    @Test
    public void captureScreenShot() throws Exception{
    	/* Setting the System Properties */
		System.setProperty("webdriver.chrome.driver", "C:/selenium_tests/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org/");
        
        /* Call getSnapShot function */
        this.getSnapShot(driver, "C:/selenium_tests/web_screenshot.png") ;
        
        /*closing Chrome Browser and System*/
        driver.close();
       
        /* Exiting the System */
        System.exit(0);
    }
    public void getSnapShot(WebDriver webDriver,String localFilePath) throws Exception{
        
    	/* Convert web driver object to TakeScreenshot */
        TakesScreenshot captureScreenShot =((TakesScreenshot)webDriver);
        
         /* Call getScreenshot as method to create image file */
         File SourceFile=captureScreenShot.getScreenshotAs(OutputType.FILE);
         
         /* Move image file to new destination */
         File DestinationFile=new File(localFilePath);
         
         /* Copy file at destination */
         FileUtils.copyFile(SourceFile, DestinationFile);
    }
}

