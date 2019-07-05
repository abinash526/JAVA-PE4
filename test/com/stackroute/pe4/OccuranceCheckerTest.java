package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceCheckerTest {

    @Test
    public void getOccuraceNumberForASubstring() {
        OccuranceChecker ob=new OccuranceChecker();
        int result=ob.checkOccurace("Hellollollo","llo");
        assertEquals(3,result);
    }
    @Test
    public void getOccuraceNumberForNotASubstring() {
        OccuranceChecker ob=new OccuranceChecker();
        int result=ob.checkOccurace("Hellollollo","pto");
        assertEquals(0,result);
    }
    @Test
    public void getOccuraceNumberForNull() {
        OccuranceChecker ob=new OccuranceChecker();
        int result=ob.checkOccurace("","pto");
        assertNull(result);
    }

}