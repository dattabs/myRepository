package MavenFirstProject.MFP;


import org.testng.Assert;

import myproject.base.TestBase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestBase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    public AppTest(Class<AppTest> class1) {
		// TODO Auto-generated constructor stub
	}

	/**
     * @return the suite of tests being tested
     */
    public static AppTest suite()
    {
        return new AppTest( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Assert.assertTrue( true );
    }
}
