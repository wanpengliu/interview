package com.wanpeng.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Wanpeng on 20/02/2017.
 */
public class StringAnagram {

    @Test
    public void test() {

        assertTrue(isAnagram("abc", "cab"));
        assertFalse(isAnagram("abc", "ceb"));
        assertFalse(isAnagram("abc", "cedb"));

    }


    private boolean isAnagram(String x, String y) {

        if (x.length() != y.length()) {
            return false;
        }

        char[] charsx = x.toCharArray();

        char[] charsy = y.toCharArray();

        Arrays.sort(charsx);
        Arrays.sort(charsy);

        return Arrays.equals(charsx, charsy);

    }
}
