

import java.util.*;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<>();
        
        for (int val : nums) s.add(val);
        int k = s.size();
        
        int j = 0;
        for (int val : s) {
            nums[j++] = val;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        RemoveDuplicates sol = new RemoveDuplicates();
        int k = sol.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}