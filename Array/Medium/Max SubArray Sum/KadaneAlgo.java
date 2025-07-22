

public class KadaneAlgo{
    public static int maxSubArraySum(int[] arr){
        // int maxi = Integer.MIN_VALUE;
        // int currSum =0;
        // for(int i=0 ;i<arr.length;i++){
        //     currSum +=arr[i];
        //     if(currSum<0) ;
        //     maxi = Math.max(currSum,maxi);
        // }
        // return maxi;
        int currSum = arr[0];
        int maxi = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxi = Math.max(maxi, currSum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1,-2,1,5,-3};
        System.out.println(maxSubArraySum(arr));
        
    }
}