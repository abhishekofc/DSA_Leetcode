public class LarDigitInNum{
    public static int Largest(int n){
      int max=0;
      while(n>0){
        int last = n%10;
        max = Math.max(last, max);
        n = n/10;
      }
      return max;
    }
    public static void main(String[] args) {
        int n = 1234;
        int res = Largest(n);
        System.out.print(res);
    }
}