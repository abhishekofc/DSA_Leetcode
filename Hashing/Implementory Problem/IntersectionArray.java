/*
 You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].

 */
import java.util.*;
public class IntersectionArray{
public static int[] intersectionCount(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    int cnt1=0,cnt2=0;
    for(int val : nums1){
        set1.add(val);
    }
    for(int val : nums2){
        set2.add(val); 
    }
    for(int val : nums1){
        if(set2.contains(val)){
            cnt1++;
        }
    }
    for(int val : nums2){
        if(set1.contains(val)){
            cnt2++;
        }
    }
    return new int[]{cnt1,cnt2};
}
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 6, 7, 8};
        intersectionCount(nums1,nums2);
        System.out.println(Arrays.toString(intersectionCount(nums1, nums2)));
    }
}