package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestExceptionTimeout {
    @Before
    public void before()
    {

    }

    @Test(timeout = 100)
    public void testTruth( )
    {
        System.out.println( "Chapter 2 - x - Exception 11.Timeout");

        ExceptionTimeout test = new ExceptionTimeout( );
        test.exceptionTimeout();
    }
    @After
    public void after()
    {

    }
}
