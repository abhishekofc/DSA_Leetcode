

public class CountOddInNum {
    public static int CountNumDigit(int n){
        int cnt=0;
        while(n>0){
            int last_digit = n%10;
            if(last_digit%2!=0){
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args){
        int n = 25;

        int result = CountNumDigit(n);
        System.out.println(result);
    }
}