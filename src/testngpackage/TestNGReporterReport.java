package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 *  
 * @author mohit
 *
 */
@Listeners(value=TestNGReporterInterface.class)
public class TestNGReporterReport {
 
    @Test(priority=0,description="firstTestCase")
    public void firstTestCase(){
        Assert.assertTrue(true);
    }
    @Test(priority=1,description="secondTestCase")
    public void secondTestCase(){
        Assert.assertTrue(false);
    }
    @Test(priority=2,description="thirdTestCase",dependsOnMethods="firstTestCase")
    public void thirdTestCase(){
    	Assert.assertTrue(true);
    }
    @Test(priority=3,description="fourthTestCase",dependsOnMethods="secondTestCase")
    public void fourthTestCase(){
    	
    }
}