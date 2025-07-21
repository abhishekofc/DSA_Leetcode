import java.util.*;

class ArrayIntersection {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])i++;
            else if(nums2[j]<nums1[i])j++;
            else{
                 // If nums1[i] == nums2[j]
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
    
        int[] ans = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};

        ArrayIntersection finder = new ArrayIntersection();

        int[] ans = finder.intersectionArray(nums1, nums2);

       
        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
