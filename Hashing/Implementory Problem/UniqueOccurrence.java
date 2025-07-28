/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
*/

import java.util.*;
public class UniqueOccurrence{
    public boolean areOccurrencesUnique(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        HashSet<Integer> freqSet = new HashSet<>();
        for (int freq : map.values()) {
            if (freqSet.contains(freq)) {
                return false;
            }
            freqSet.add(freq);
        }
        return true;      
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        UniqueOccurrence obj = new UniqueOccurrence();
        System.out.println(obj.areOccurrencesUnique(arr));
    }
}