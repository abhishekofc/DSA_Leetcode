public class PerfectNumber{
    public static boolean isPerfect(int n){
        int og = n;
        int sum=0;
        for(int i=1 ; i<=n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        return sum== og;
    }
    public static void main(String[] args) {
        int n = 6;
        boolean res = isPerfect(n);
        System.out.print(res);
    }
}