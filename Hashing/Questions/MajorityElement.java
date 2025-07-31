/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
*/
import java.util.*;
public class MajorityElement{
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
            // Alternative way to update the count:
            // if(map.containsKey(val)){
            //     map.put(val,map.get(val)+1);
            // }
            // else{
            //     map.put(val,1);
            // }
        }
        Set<Integer> keySet = map.keySet();
        for(int key:keySet){
            if(map.get(key) > arr.length / 3) {
                System.out.println(key);
                return; 
            }
        }
    }
}