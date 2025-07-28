/*
Given an integer array nums, 
return true if any value appears at least twice 
return false if every element is distinct. 
*/
import java.util.*;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int num : nums){
            if(ans.contains(num))return true;
            else ans.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(cd.containsDuplicate(nums));
    }
}