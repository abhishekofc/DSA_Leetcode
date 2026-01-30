// Print numvbers from n to 1 in decreasing order using recursion

/* 
 Method 1 - Using Loop 
import java.util.*;
public class DecreasingOrder {
    public static void printDecreasing(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
} 
    */ 


// Method 2 - Using Recursion
import java.util.*;
public class DecreasingOrder {
    public static void printDecreasing(int n) {
        // Base Case
        if (n == 0) return;
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}



/*
Comparison:
Both loop and recursion take O(n) time.
However, the loop approach is better because it uses constant space O(1), while recursion uses O(n) stack space.
Iteration also avoids function-call overhead and stack overflow issues.

*/