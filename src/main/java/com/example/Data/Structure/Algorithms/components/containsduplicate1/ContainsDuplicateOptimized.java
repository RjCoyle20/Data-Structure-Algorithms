package com.example.Data.Structure.Algorithms.components.containsduplicate1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicateOptimized {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
