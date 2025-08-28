
public class CountDigitInNum{
    public static int CountNumDigit(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int n = 5;

        int result = CountNumDigit(n);
        System.out.println(result);
    }
}