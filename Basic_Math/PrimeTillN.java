class PrimeTillN{
    public static boolean isPrime(int n) {
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
    public static int primeUptoN(int n) {
        int cnt =0;
        for(int i = 1 ; i<=n ;i++){
            if(isPrime(i)) cnt++;
        }
        return cnt;        
    }
public static void main(String[] args) {
    
    int n = 10; // Example input
    int result = primeUptoN(n);
    System.out.println( result);
}
}