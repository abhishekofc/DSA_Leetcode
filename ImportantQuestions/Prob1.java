/*Question 1: Move all # to the front of the string
Problem Statement
Write a function to accept a string and move all # characters to the front while keeping the other 
characters in their relative positions.
Constraints:
 1 ≤ length of string ≤ 100
 The string will contain only alphabets and #.
Input:
A string str of length n.
Output:
A modified string with all # at the front.
Example:
Input: Move#Hash#to#Front
Output: ###MoveHashtoFront
*/


public class Prob1 {
    static void moveSpaceInFront(char str[]) {
        int i = str.length-1;
        for(int j = i ; j>=0 ;j--){
            if(str[j]!= ' '){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i--;
            }
        }
    }
    public static void main(String[] args) {
        char str[] = "Hey there, it's GeeksforGeeks".toCharArray(); 
        moveSpaceInFront(str); 
        System.out.println(String.valueOf(str));
    }
}


