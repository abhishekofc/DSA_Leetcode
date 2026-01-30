/* 
Method 1 - Using Iteration
import java.util.*;
public class IncreasingOrder{
    public static void printIncreasing(int n){
        for(int i = 1 ; i<=n ; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
    */


// Method 2 - Using Recursion
import java.util.*;
public class IncreasingOrder {
    public static void printIncreasing(int n) {
        // Base Case
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}