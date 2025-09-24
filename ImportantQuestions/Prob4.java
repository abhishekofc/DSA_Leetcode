/*
Question 4: Count Frequencies of Array Elements
Problem Statement
Given an array of integers, count the frequency of each unique element and print the results.
Constraints:
 1 ≤ n ≤ 100
 Array elements range from -1000 to 1000.
Input:
An integer n, followed by n integers (the array).
Output:
Frequency of each unique element in the format:
element occurs x times.
Example:
Input:
10
1 2 3 3 4 1 4 5 1 2
Output:
1 occurs 3 times 
2 occurs 2 times 
3 occurs 2 times 
4 occurs 2 times 
5 occurs 1 times
*/

import java.util.*;
public class Prob4{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Use LinkedHashMap to preserve insertion order
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }

        sc.close();
    }
}