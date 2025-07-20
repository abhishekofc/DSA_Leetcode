
class LargestElement {
    /*  Approach 01
    public static int largestElement(int[]  nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        return largest;
    }*/
     public static int largestElement(int[]  nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};
        LargestElement sol = new LargestElement();

        int largest = sol.largestElement(nums);
        System.out.print(largest);
    }
}


/*
Approach 01
Sort the array and return the last element as the largest.
Time Complexity: O(n log n) due to sorting.   


Approach 02
Iterate through the array and keep track of the largest element found.
Time Complexity: O(n) as we traverse the array once.


*/

