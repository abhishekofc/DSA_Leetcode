public class Recursion{
    // count ways func
    public static int fun(int n){
        if(n == 0) return 1;
        if(n < 0 ) return 0;
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
}