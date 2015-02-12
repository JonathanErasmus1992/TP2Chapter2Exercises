package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestFalse {
    @Before
    public void before()
    {

    }

    @Test
    public void testTruth( )
    {
        System.out.println( "Chapter 2 - vi - False");

        False test = new False( );

        Assert.assertFalse( "Is the statement false", test.ffalse( false ) );
    }
    @After
    public void after()
    {

    }
}
