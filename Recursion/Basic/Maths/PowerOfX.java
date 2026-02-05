import java.util.*;
public class PowerOfX{
    public static int power(int x , int n){
        // Base Case
        if(n == 0) return 1;
        // Recursive Case
        return x * power(x, n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}


/*
Method 2  : Optimized Approach (Using Divide and Conquer) with O(log n) time complexity
public class PowerOfX{
    public static int power(int x , int n){
        // Base Case
        if(n == 0) return 1;
        // Recursive Case
        int halfPower = power(x, n/2);
        if(n % 2 == 0){
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}


*/