package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestFailing {
    @Before
    public void before()
    {

    }

    @Test
    public void testFail( )
    {

        System.out.println( "Chapter 2 - ix - Failing Test");

        Assert.fail("The test is supposed to fail");
    }
    @After
    public void after()
    {

    }
}
