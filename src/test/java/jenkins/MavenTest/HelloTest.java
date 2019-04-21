package jenkins.MavenTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HelloTest extends TestCase
{
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
     */
    public void testApp()
    {
    	System.out.println("Hello Test suite method testApp");
        assertTrue( true );
    }
	
}
