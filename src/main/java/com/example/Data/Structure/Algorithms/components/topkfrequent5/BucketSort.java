package com.example.Data.Structure.Algorithms.components.topkfrequent5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort {
    public int[] topKFrequent(int[] nums, int k) {
        // create a Hashmap named count
        Map<Integer, Integer> count = new HashMap<>();
        // create an Array of Lists that hold integers named freq. Its length will be one more than nums
        List<Integer>[] freq = new List[nums.length + 1];
        // Use a for loop to put new ArrayLists in each index of freq
        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        //Use a for each loop to iterate through nums and add each to count, with a key of the num and a value representing its instances + 1, defaulting to 0 if not there.
        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) +1);
        }

        //Use a for each entry/entrySet to iterate through count and add them to freq at an index being the instances of the number, the value being the number itself
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        //Create a new int array named res with a length of k
        int[]res = new int[k];
        //create an int index variable which equals 0
        int index = 0;
        // Use a for i loop, where i is the length of freq - 1; while i is greater than 0 and our index variable is less than k; lower i each time
        for(int i = freq.length -1; i > 0 && index < k; i--){
            // Use a for each loop with each n of each frequency at an index of i (we are starting at the most frequent of our bucket and working down). Set the res at index of index variable++ equal to n.
            for(int n : freq[i]){
                res[index++] = n;
                // If index equals k, return res.
                if (index == k) {return res;}
            }
        }
        //return res if we've gone through and not found our max k number of frequencies.
        return res;
    }
}
