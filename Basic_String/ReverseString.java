//Given a string, the task is to reverse it. 
// The string is represented by an array of characters s. Perform the reversal in place with O(1) extra memory.


import java.util.*;

class ReverseString {
    public void reverseString(List<Character> s) {
        int start = 0, end = s.size() - 1;

        while (start < end) {
            char ch = s.get(start);
            s.set(start, s.get(end));
            s.set(end, ch);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Convert String to List<Character>
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        ReverseString sol = new ReverseString();
        sol.reverseString(charList);

        // Print reversed list
        for (char c : charList) {
            System.out.print(c);
        }
    }
}
