/*
Binary Strings Problem => (Asked in Paytm)
Given a number n, we need to find the total number of binary strings of length n such that there are no consecutive 1's in the string.
Example 1:  
Input: n = 3
Output: 5
Explanation: The 5 binary strings of length 3 with no consecutive 1's are: 000, 001, 010, 100 and 101.
*/
public class BinaryStrings{
    public static void printbinStrings(int n , int lastPlace, String str){
        //kaam
        if(n == 0){
            System.out.println(str);
            return;
        }
        printbinStrings(n-1, 0,str+"0");
        if(lastPlace == 0){
           printbinStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
         printbinStrings(3, 0, ""));
    }
}