package com.wanpeng.string;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wanpeng on 20/02/2017.
 */
public class NoneRepeatingCharacter {

    @Test
    public void test() {
        assertEquals("a", firstNoneRepeatingCharacter("abcdefg"));
        assertEquals("b", firstNoneRepeatingCharacter("abcdefga"));
        assertEquals("a", firstNoneRepeatingCharacter("dasdf"));

    }

    private String firstNoneRepeatingCharacter(String input) {

        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                Integer integer = map.get(c);
                integer++;
                map.put(c, integer);
            }
        }

        for (Map.Entry e : map.entrySet()) {
            if (e.getValue().equals(1)) {

                return e.getKey().toString();
            }
        }
        return "";
    }
}
