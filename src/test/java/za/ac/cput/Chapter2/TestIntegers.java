package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestIntegers {
    @Before
    public void before()
    {

    }

    @Test
    public void testInteger( )
    {
        System.out.println( "Chapter 2 - ii - Integer ");

        Integers test = new Integers( );

        Assert.assertEquals(3, test.integers(9, 6), 1);

    }
    @After
    public void after()
    {

    }
}
