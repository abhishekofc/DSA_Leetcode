/*
Question 6: Find the Number of Tyres
Problem Statement
For multiple dealerships, calculate the total number of tyres based on the number of cars and bikes.
Constraints:
 1 ≤ t ≤ 100 (number of dealerships)
 0 ≤ cars, bikes ≤ 100
Input:
An integer t, followed by t lines containing two integers each (cars and bikes).
Output:
Total number of tyres for each dealership.
Example:
Input:
3 
4 2 
4 0 
1 2 
Output:
20 
16
8
 */
import java.util.*;
 public class Prob6{
    public static int helper(int cars, int bikes){
        return (cars * 4) + (bikes * 2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i< t ;i++){
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            System.out.print(helper(cars,bikes));
        }
        sc.close();
    }
 }