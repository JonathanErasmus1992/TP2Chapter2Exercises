package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestDisabling {
    @Before
    public void before()
    {

    }

    @Ignore
    public void testDisabling( )
    {
        System.out.println( "Chapter 2 - xi - Test Disabling");

        Disabling test = new Disabling( );
        test.dis( 4 );
    }
    @After
    public void after()
    {

    }
}
