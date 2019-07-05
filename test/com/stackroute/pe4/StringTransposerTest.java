package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposerTest {
    StringTransposer ob;

    @Before
    public void setUp() throws Exception {
    ob=new StringTransposer();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void transposeString() {
        String result=ob.transposeString("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",result);
    }
    @Test
    public void transposeStringNotNull() {
        String result=ob.transposeString("a quick brown fox jumps over the lazy dog");
        assertNotNull(result);
    }
}