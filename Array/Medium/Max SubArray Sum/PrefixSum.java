public class PrefixSum{
    public static void maxSubarraySum(int[] arr) {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0]= arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length ; i++) {
            int start =i;
            for (int j= i; j< arr.length; j++) {
                int end =j;
                currSum = start==0 ? prefixSum[end] : prefixSum[end]-prefixSum[start-1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        maxSubarraySum(arr);
    }
}