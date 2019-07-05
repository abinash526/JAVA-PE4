package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceCheckerTest {
    MultipleOccuranceChecker ob;

    @Before
    public void setUp() throws Exception {
        ob=new MultipleOccuranceChecker();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void getIndexOfMultipleOccurance() {
        String result=ob.checkMultipleOccurance("She sells seashells by the seashore","se");
        assertEquals("4-6 10-12 27-29 ",result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNotNull() {
        String result=ob.checkMultipleOccurance("She sells seashells by the seashore","se");
        assertNotNull(result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNull() {
        String result=ob.checkMultipleOccurance(null,"se");
        assertNull(result);
    }
    @Test
    public void getIndexOfMultipleOccuranceNoPattern() {
        String result=ob.checkMultipleOccurance("akhgsfkugsahf adsf","pkn");
        assertEquals("",result);
    }
}
