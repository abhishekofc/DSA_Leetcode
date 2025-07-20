
class SecondLargest {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } 
            else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ?  -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 7, 5};
        SecondLargest sol=new SecondLargest();
        int n = nums.length;
        int sL = sol.secondLargestElement(nums);
        System.out.println("Second largest is " + sL);
    }
}

/*
 Approach 01 Brute Force
 By sorting the array , the largest element will be surely at the last index, and the second largest element will be at the second-to-last index.
        int n = nums.length;
     
        if (n < 2) return -1;
        Arrays.sort(nums);
        int largest = nums[n - 1];
        int secondLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }
    Time Complexity: O(n log n) due to sorting.


    Approach 02
    Eliminate Sorting by Using Loops 
    int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > secondLargest  && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
    Time Complexity: O(2n) as we traverse the array twice.
 */