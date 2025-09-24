/*
Question 5: Solve Polynomial Equation
Problem Statement
Write a function to evaluate the equation:
a^3 + a^2*b + 2a^2*b + 2a*b^2 + a*b^2 + b^3.
Constraints:
 1 ≤ a, b ≤ 100
Input:
Two integers a and b.
Output:
The result of the polynomial equation.
Example:
Input:
2 3
Output:
125
*/

public class Prob5{
    public static void main(String args[]){
        int a = 2;
        int b = 3;
        int result = (int)(Math.pow(a,3) + a*a*b + 2*a*a*b + 2*a*b*b + a*b*b + Math.pow(b,3));
        System.out.println(result);
    }
}