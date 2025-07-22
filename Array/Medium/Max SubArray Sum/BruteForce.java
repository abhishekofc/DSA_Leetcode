public class BruteForce{
    public static void maxSubarraySum(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end;k++){
                    currSum += arr[k];
                }
                if(maxSum < currSum) maxSum = currSum;
            }  
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4};
         maxSubarraySum(arr);
    }
}

/*
This code implements a brute force solution to find the maximum subarray sum in an array.
It iterates through all possible subarrays, calculates their sums, and keeps track of the maximum sum found.
This approach has a time complexity of O(n^3) due to the three nested loops. => Causes TLE

 */