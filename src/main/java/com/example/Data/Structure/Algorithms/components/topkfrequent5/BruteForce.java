package com.example.Data.Structure.Algorithms.components.topkfrequent5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BruteForce {
    public int[] topKFrequent(int[] nums, int k) {
        // BRUTE FORCE SOLUTION
        // create a Hashmap named count
        Map<Integer, Integer> count = new HashMap<>();

        //iterate through our nums, add them to Hashmap count with a key matching the number and a value representing the occurrences of the number, defaulting to 0 if this is its first time being seen in the array.
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) +1);
        }
        // create a new List of integer arrays named arr. These arrays will only hold two numbers, the frequency of occurrence and number
        List<int[]> arr = new ArrayList<>();
        // add new integer arrays to the ArrayList arr. These consist of the [frequency, number]
        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        // sort the List in descending order by the frequency
        arr.sort((a, b) -> b[0] - a[0]);

        //create a new integer array named res for the result. Its length will be the k number of numbers we're looking for
        int[] res = new int[k];

        //iterate through our list of arrays arr, assigning the second number in the arrays to the same index in array res.
        for (int i = 0; i < k ; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
