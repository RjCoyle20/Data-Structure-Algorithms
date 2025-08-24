package com.example.Data.Structure.Algorithms.components.validanagram2;

import java.util.Arrays;

public class ValidAnagramBruteForce {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        return Arrays.equals(sortedS,sortedT);

    }
}
