// Remove Duplicates from a String using Recursion
public class RemoveDuplicates{
    public static void removeDupli(String str ,int idx, StringBuilder newStr, boolean[] map){
        
        // Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // Duplicate
            removeDupli(str, idx + 1, newStr, map);
        } else {
            // Not Duplicate
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDupli(str, idx + 1, newStr, map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDupli(str, 0, new StringBuilder(""), new boolean[26]);
    }
}