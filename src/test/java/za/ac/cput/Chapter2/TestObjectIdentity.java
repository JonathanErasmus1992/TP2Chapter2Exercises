package za.ac.cput.Chapter2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/11.
 */
public class TestObjectIdentity {
    @Before
    public void before()
    {

    }

    @Test
    public void testObjectIdentity( )
    {
        System.out.println( "Chapter 2 - iv - Object Identity ");

        ObjectIdentity oe1 = new ObjectIdentity( );
        ObjectIdentity oe2 = new ObjectIdentity( );

        Assert.assertNotSame(oe1, oe2);

    }
    @After
    public void after()
    {

    }
}
