package jenkins.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HelloTest extends TestCase
{
	
	String path = System.getProperty("user.dir");
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloTest( String testName )
    {
        super( testName );
        System.out.println("HelloTest constructor testname : " + testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	System.out.println("Hello Test suite method which returns true 1111111111111111111111111111111111111111111");
        return new TestSuite( HelloTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws InterruptedException 
     */
    public void testApp() throws InterruptedException
    {
    	System.out.println("Hello Test suite method testApp");
    	
    	System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");
    	
    	// Initialize browser
    	WebDriver driver=new ChromeDriver();
    	// Open facebook
    	driver.get("http://www.facebook.com");
    	Thread.sleep(2000);
    	// Maximize browser
    	driver.manage().window().maximize();
    	driver.quit();
        assertTrue( true );
    }
	
}
