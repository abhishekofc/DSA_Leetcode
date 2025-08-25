/*
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
 */

 import java.util.*;
public class AnangramString{
    public static boolean isAnangram(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for( char ch : t.toCharArray()){
            if(map.get(ch) != null ){
                if(map.get(ch)== 1) map.remove(ch);
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else return false;     
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnangram(s,t));
        
    }
}


/* TIme Complexity: O(n log n )
 * 
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
        
    Arrays.sort(sChars);
    Arrays.sort(tChars);

    return Arrays.equals(sChars, tChars);
 */