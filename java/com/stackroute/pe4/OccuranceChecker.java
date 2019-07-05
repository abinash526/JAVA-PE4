package com.stackroute.pe4;

public class OccuranceChecker {
    public int checkOccurace(String inputString,String subStr)//Checking the occurance without using any loop
    {
        String newInputStr=inputString;
        return (inputString.length()-inputString.replace(subStr,"").length())/subStr.length();
    }
}
