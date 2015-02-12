package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestObjectEquality {
    @Before
    public void before()
    {

    }

    @Test
    public void testObjectEquality( )
    {
        System.out.println( "Chapter 2 - iii - Object Equality");

        ObjectEquality oe1 = new ObjectEquality( );
        ObjectEquality oe2 = new ObjectEquality( );

        Assert.assertSame( oe1, oe1);
    }
    @After
    public void after()
    {

    }
}
