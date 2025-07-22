import java.util.*;
public class Memoisation{
    public static int fun(int n , int dp[]){
        if(n == 0)return 1;
        if(n<0) return 0 ;
        // Already calculated
        if(dp[n] != -1) return dp[n]; 
        dp[n] = fun(n-1,dp) + fun(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(fun(n,dp));
    }
}