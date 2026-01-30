import java.util.Scanner;

public class Factorial{

    /* 
    Method 1 - Using Loop
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }*/
    public static int fact(int n){
        // Base Case 
        if(n== 0) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}