package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestNotNull {
    @Before
    public void before()
    {

    }

    @Test
    public void testNotNull( )
    {
        System.out.println( "Chapter 2 - viii - Not Null");

        NotNull test = new NotNull( );

        Assert.assertNotNull(test.notnull("My Name Is - What!!"));
    }
    @After
    public void after()
    {

    }
}
