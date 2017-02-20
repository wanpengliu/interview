package com.wanpeng.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutations {

    List<String> allPermutations = new ArrayList<>();

    @Test
    public void testUsingRecursion() {
        String x = "abc";

        Set<String> permutate = permutate(x);
        permutate.forEach(System.out::println);
    }

    private Set<String> permutate(String input) {

        Set<String> strings = new HashSet<>();
        if (input.length() == 1) {
            strings.add(input);
        } else {
            char firstCharacter = input.charAt(0);
            Set<String> permutate = permutate(input.substring(1));
            for (String s : permutate) {

                for (int i = 0; i <= s.length(); i++) {

                    String begin = s.substring(0, i);
                    String end = s.substring(i);
                    strings.add(begin + firstCharacter + end);

                }
            }
        }
        return strings;
    }
}
