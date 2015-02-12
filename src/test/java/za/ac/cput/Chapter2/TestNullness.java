package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestNullness {
    @Before
    public void before()
    {

    }

    @Test
    public void testNullness( )
    {
        System.out.println( "Chapter 2 - vii - Nullness" );

        Nullness test = new Nullness( );

        Assert.assertNull(test.nullness(null));
    }
    @After
    public void after()
    {

    }
}
