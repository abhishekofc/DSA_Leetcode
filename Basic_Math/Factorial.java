public class Factorial{
    public static int Fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int res=Fact(n);
        System.out.print(res);
    }
}