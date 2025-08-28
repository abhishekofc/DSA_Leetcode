public class isPrime{
    public static boolean Prime(int n){
       int count = 0;
        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                count = count + 1;
                
                if (n / i != i) {
                    count = count + 1;
                }
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        int n = 5;
        boolean result=Prime(n);
        System.out.print(result);
     }
}