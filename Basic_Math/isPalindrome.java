public class isPalindrome{
    public static boolean Palin(int n){
        int og = n;
        int rev=0;
        while(n>0){
            int last = n%10;
            rev = rev*10 + last;
            n = n/10; 
        }
        return og == rev;
    }
    public static void main(String[] args) {
        int n = 121;
        boolean result = Palin(n);
        System.out.print(result);
        
    }
}