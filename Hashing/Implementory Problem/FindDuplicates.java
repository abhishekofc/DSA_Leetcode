/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
 */
import java.util.*;
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val , map.getOrDefault(val,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)> 1){
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindDuplicates fd = new FindDuplicates();
        System.out.println(fd.findDuplicates(nums));
    }
}