package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class TestArrayContent {
    @Before
    public void before()
    {

    }

    @Test
    public void testArrayContent( )
    {
        System.out.println( "Chapter 2 - xii - Array Content");

        ArrayContent test = new ArrayContent( );
        int[ ] arr1 = new int[ 5 ];
        int[ ] arr2 = new int[ 8 ];
        Assert.assertArrayEquals(arr1, test.arrayContent( arr2 ));
    }
    @After
    public void after()
    {

    }
}
