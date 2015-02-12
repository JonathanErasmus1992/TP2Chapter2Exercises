package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestTruth {
    @Before
    public void before()
    {

    }

    @Test
    public void testTruth( )
    {
        System.out.println( "Chapter 2 - v - Truth");

        Truth test = new Truth( );

        Assert.assertTrue("Is the statement true", test.truth( true ) );

    }
    @After
    public void after()
    {

    }
}
