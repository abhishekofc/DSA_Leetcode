/*
Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
 */

import java.util.*;
public class SameFrequency{
     public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char val: s.toCharArray()){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        int maxFreq = map.get(s.charAt(0));
        for(int val : map.values()){
            if(val != maxFreq){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aabbcc";
        SameFrequency sf = new SameFrequency();
        System.out.println(sf.areOccurrencesEqual(s));
    }
}