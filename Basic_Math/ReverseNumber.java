public class ReverseNumber{
    public static int Reverse(int n ){
        int rev=0;
        while(n>0){
            int last_digit = n%10;
            rev = rev*10 + last_digit;
            n=n/10;
        }
        return rev;
    }
    
    public static void main(String[] args){
        int n = 25;

        int result = Reverse(n);
        System.out.println(result);
    }
}
