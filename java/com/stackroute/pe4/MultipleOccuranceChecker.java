
package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccuranceChecker {
    public String checkMultipleOccurance(String word,String subStr)
    {
        if(word==null)
            return null;
        Pattern pattern=Pattern.compile(subStr);//Pattern or substring is stored
        Matcher matcher=pattern.matcher(word);//Matcher or the main string is matched
        String result="";
        while(matcher.find()) {

            //matcher.start() contains the 1st index of the substring and matcher.end() contains the last index of the end
            result = result + matcher.start() + "-" + matcher.end()+" ";
        }

        return result;
    }
}
