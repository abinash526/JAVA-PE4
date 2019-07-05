package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSorterTest {
    StringSorter ob;

    @Before
    public void setUp() throws Exception {
        ob=new StringSorter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringSorter() {
        String res=ob.stringSorter("hello I am Abinash");
        assertEquals("Abinash am hello I ",res);
    }
    @Test
    public void stringSorterNotNull() {
        String res=ob.stringSorter("hello I am Abinash");
        assertNotNull(res);
    }
    @Test
    public void stringSorterNull() {
        String res=ob.stringSorter(null);
        assertNull(res);
    }
}