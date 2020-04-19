package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 *  
 * @author mohit
 *
 */
@Listeners(TestNGITestListenerReport.class)
public class TestNGReport {
 
    @Test
    public void firstTestCase(){
        Assert.assertTrue(true);
    }
 
    @Test
    public void secondTestCase(){
        Assert.assertTrue(false);
    }
 
    //Test case that depends on passed test case i.e. firstTestCase
    @Test(dependsOnMethods="firstTestCase")
    public void thirdTestCase(){
    	Assert.assertTrue(true);
    }
    
    //Test case that depends on failed test case i.e. secondTestCase
    @Test(dependsOnMethods="secondTestCase")
    public void fourthTestCase(){
    	
    }
}
