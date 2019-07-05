
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionSearcherTest {
    RegularExpressionSearcher ob;

    @Before
    public void setUp() throws Exception {
        ob=new RegularExpressionSearcher();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void searchRegularExpresison() {
        String result=ob.searchRegularExpresison("This is Harry");
        assertEquals("Contains Harry",result);
    }
    @Test
    public void getRegularExpresisonForHenry() {
        String result=ob.searchRegularExpresison("This is Henry");
        assertEquals("Contains Henry",result);
    }
    @Test
    public void getRegularExpresisonForNotAvailable() {
        String result=ob.searchRegularExpresison("This is Abinash");
        assertEquals("Doesn't contains Harry and Henry both",result);
    }
}