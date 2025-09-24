/*public class StringCompression {
    
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                sb.append(str.charAt(i-1));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        if(count>1){
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
       
}
*/


/*
Question 2: String Compression
Problem Statement
Compress a string such that consecutive repeated characters are represented by the character 
followed by its count.
Constraints:
 1 ≤ length of string ≤ 100
 The string will contain only lowercase alphabets.
Input:
A string str of length n.
Output:
A compressed string.
Example:
Input: aabbbbeeeeffggg
Output: a2b4e4f2g3
 */


public class Prob2{
    public static String compress(String str){
        String newStr = "";
        for(int i = 0 ; i< str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            if(count>1){
                newStr = newStr + count.toString();
            }
        }
        return newStr;
    }
    
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";
        System.out.println(compress(str));
    }
}



/* If input param is Array 
class Solution {
    public int compress(char[] chars) {
        String str = "";
        for( int i = 0 ; i< chars.length ; i++){
            int count = 1 ; 
            while( i < chars.length -1  && chars[i]== chars[i+1]){
                count ++;
                i++;
            }
            str += chars[i];
            if(count > 1) str += count;
        }
        for(int i = 0 ; i< str.length(); i++){
            chars[i]= str.charAt(i);
        }
        return str.length();
    }

}

*/