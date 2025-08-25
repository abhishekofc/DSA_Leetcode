import java.util.Arrays;

class Anagram {
    public boolean anagramStrings(String s, String t) {
       
        if (s.length() != t.length()) return false;


        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

    
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Anagram solution = new Anagram();
        String str1 = "INTEGER";
        String str2 = "TEGERNI";
        boolean result = solution.anagramStrings(str1, str2);
        System.out.println(result ? "True" : "False");
    }
}
