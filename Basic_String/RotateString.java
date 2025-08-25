public class RotateString {
    public boolean rotateString(String s, String goal) {
    // Strings must be same length to be rotations of each other
        if (s.length() != goal.length()) {
            return false; 
        }
        // Try all possible rotations of s
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i); 
            if (rotated.equals(goal)) {
                return true; 
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        RotateString sol = new RotateString();
        System.out.println(sol.rotateString("abcde", "cdeab"));  
        System.out.println(sol.rotateString("abcde", "abced"));  
    }
}
