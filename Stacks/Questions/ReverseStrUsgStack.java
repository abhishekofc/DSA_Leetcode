import java.util.*;
public class ReverseStrUsgStack{
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();

        
    }
    public static void main(String[] args) {
        String str="abc";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }
}