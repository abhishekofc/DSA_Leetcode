import java.util.*;
public class SameFrequency{
     public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char val: s.toCharArray()){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        int maxFreq = map.get(s.charAt(0));
        for(int val : map.values()){
            if(val != maxFreq){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aabbcc";
        SameFrequency sf = new SameFrequency();
        System.out.println(sf.areOccurrencesEqual(s));
    }
}