package com.stackroute.pe4;

public class CharacterReplacer {
    public String replaceCharacter(String inputStr)
    {
        if(inputStr==null)
            return null;
        inputStr=inputStr.replace("d","f");//Replacing the d with f
        inputStr=inputStr.replace("l","t");//Replacing l with t
        return inputStr;
    }

}
