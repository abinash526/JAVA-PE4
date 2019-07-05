package com.stackroute.pe4;

import java.util.Arrays;

public class StringSorter {
    public String stringSorter(String paraString)
    {
        if(paraString==null)
            return null;
        String[] arrStr=paraString.split(" ");
        /*
        * Sorting array of string ignoring the case*/
        Arrays.sort(arrStr,String.CASE_INSENSITIVE_ORDER);
        String sortedOutputArray="";//Output String
        for(String s:arrStr)
        {
            sortedOutputArray=sortedOutputArray.concat(s).concat(" ");
        }
        return sortedOutputArray;
    }
}
