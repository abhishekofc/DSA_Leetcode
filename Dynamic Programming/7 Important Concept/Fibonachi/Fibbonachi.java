
public class Fibbonachi{
    public static int recursion(int n){
        if(n== 0 || n==1)return n;
        return recursion(n-1)+recursion(n-2);
    }


//this has very bad TC of Order of two to the power n

// Memoization => DP method 
    public static int fib(int n, int dp[]){
        if(n== 0 || n==1)return n;
// if fib(n) is already calculated
        if(dp[n] != 0 )return dp[n]; 
        dp[n] = fib(n-1 , dp) + fib(n-2 , dp);
        return dp[n];
    }
// Tabulation
    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2 ; i<= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        //int dp[] = new int[n+1];
        int f[] = new int[n+1];
        //System.out.println(fib(n,dp));
        System.out.println(fibTabulation(n));
    }
}
// TC : changes to Exponential to Linear 
