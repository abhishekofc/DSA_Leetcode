import java.util.*;

class ArrayUnion {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }

    
        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set) {
            union[index++] = num;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayUnion finder = new ArrayUnion();

     
        int[] union = finder.unionArray(nums1, nums2);

        System.out.println("Union of nums1 and nums2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}