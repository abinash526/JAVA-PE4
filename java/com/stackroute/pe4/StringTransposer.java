package com.stackroute.pe4;

public class StringTransposer {
    public String transposeString(String paragraph)//Transposing the input paragraph
    {
        if(paragraph.length()==0||paragraph==null)
            return null;
        String[] str=paragraph.split(" ");
        String outp="";
        for(String s:str)
        {
            outp=outp+new StringBuffer(s).reverse()+" ";//Each word is reversed using String Buffer
        }
        return outp;
    }
}
