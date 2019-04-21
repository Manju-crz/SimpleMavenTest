package jenkins.MavenTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("AppTest constructor testname : " + testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	System.out.println("App Test suite method which returns true");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("App Test suite method testApp");
        assertTrue( true );
    }
}
