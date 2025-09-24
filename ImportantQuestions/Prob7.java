/*
Question 7: Largest Element in Array
Problem Statement
Find the largest element in an array of integers.
Constraints:
 1 ≤ n ≤ 100
 Array elements range from -10^6 to 10^6.
Input:
An integer n, followed by n integers (the array).
Output:
The largest element in the array.
Example:
Input:
5 
1 -4 3 6 2 
Output:
6
 */
public class Prob7{
    public static void main(String args[]){
        int arr[] = {1, -4, 3, 6, 2};
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > maxi){
                maxi = Math.max(maxi, arr[i]);
            }
        }
        System.out.println(maxi);
    }

}