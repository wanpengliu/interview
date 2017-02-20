package com.wanpeng.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Wanpeng on 20/02/2017.
 */
public class ReverseString {

    private final String INPUT = "abcdefg";
    private final String OUTPUT = "gfedcba";

    @Test
    public void testUsingStringBuffer() {

        StringBuffer stringBuffer = new StringBuffer(INPUT);
        String reversedString = stringBuffer.reverse().toString();
        assertEquals(OUTPUT, reversedString);
    }

    @Test
    public void testUsingLoop() {

        char[] chars = INPUT.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        assertEquals(OUTPUT, new String(chars));
    }

    @Test
    public void testReverseUsingRecusion() {
        assertEquals(OUTPUT, reverseString(INPUT));
    }


    private String reverseString(String inputParam) {

        if (inputParam == null) {
            return null;
        }
        if (inputParam.length() == 1) {
            return inputParam;
        } else {
            return reverseString(inputParam.substring(1)) + inputParam.charAt(0);
        }
    }

}
