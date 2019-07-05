package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacerTest {

    @Test
    public void replaceCharacter() {
        CharacterReplacer ob=new CharacterReplacer();
        String result=ob.replaceCharacter("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void replaceCharacterNotNull() {
        CharacterReplacer ob=new CharacterReplacer();
        String result=ob.replaceCharacter("daily dry");
        assertNotNull(result);
    }
    @Test
    public void replaceCharacterNull() {
        CharacterReplacer ob=new CharacterReplacer();
        String result=ob.replaceCharacter(null);
        assertNull(result);
    }

}