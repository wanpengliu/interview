package com.wanpeng.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wanpeng on 20/02/2017.
 */
public class RemoveString {
    private final String INPUT = "abcadaefg";
    private final String OUTPUT = "bcdefg";
    private final String GIVENCHAR = "a";

    @Test
    public void testRemoveCharacterRecursion() {

        assertEquals(OUTPUT, filterCharacter(INPUT, GIVENCHAR));

    }

    private String filterCharacter(String inputParam, String filterCharacter) {

        if (inputParam.equals(filterCharacter)) {
            return "";
        }

        if (inputParam.length() == 1) {
            return inputParam;
        } else {
            return filterCharacter(String.valueOf(inputParam.charAt(0)), filterCharacter) + filterCharacter(inputParam.substring(1), filterCharacter);
        }

    }

    @Test
    public void testRemoveStringWithLoop() {

        String result = "";
        for (int i = 0; i < INPUT.length(); i++) {
            if (!String.valueOf(INPUT.charAt(i)).equals(GIVENCHAR)) {
                result = result + INPUT.charAt(i);
            }
        }
        assertEquals(OUTPUT, result);
    }

}
