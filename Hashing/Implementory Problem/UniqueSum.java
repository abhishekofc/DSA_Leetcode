/*
 You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.
Example 1:
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
 */

import java.util.*;
public class UniqueSum{
public static int uniqueSum(int[] nums) {
    Map<Integer , Integer> map = new HashMap<>();
    for(int val : nums){
        map.put(val , map.getOrDefault(val, 0) + 1);
    }
    int sum=0;
    for(int key : map.keySet()){
        if(map.get(key) == 1){
            sum += key;
        }
    }
    return sum;
}
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(uniqueSum(nums));
    }

}