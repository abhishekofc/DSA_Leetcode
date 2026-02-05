/*
Friends Pairing Problem
Given n friends, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once. 
Find out the total number of ways in which friends can remain single or can be paired up.
Example 1:
Input: n = 3                
Output: 4
Explanation: Let the three friends be A, B and C.   
There are 4 ways in which these friends can remain single or can be paired up:
1) A, B and C remain single
2) A is paired with B and C remains single
3) A is paired with C and B remains single
4) B is paired with C and A remains single

Asked in Goldman Sachs
*/

public class FriendsPairing{
    public static int friendPair(int n ){
        // Base Case
        if(n == 0 || n == 1 || n == 2) return n;

        // Kaam
        int single = friendPair(n-1); // single choice
        int pairUp = friendPair(n-2) * (n-1); // pair up choice

        int totalWays = single + pairUp;
        return totalWays;
    }
    public static void main(String[] args) {

        System.out.println(friendPair(3));
    }
}