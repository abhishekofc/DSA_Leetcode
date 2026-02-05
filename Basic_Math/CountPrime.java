import java.util.*;
public class CountPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0 is not prime
        isPrime[1]= false; // 1 is not prime
        for(int i = 2 ; i*i < n ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j < n ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2 ; i < n ; i++){
            if(isPrime[i]) count++;
        }
        System.out.print(count);

    }
}


/*
Intuition
The problem asks us to count all prime numbers less than n. 
A brute force approach of checking each number individually would be too slow. Instead, 
we can use the Sieve of Eratosthenes - an ancient algorithm that efficiently finds all primes by eliminating multiples of each prime number. 
The key insight is: if a number is prime, all its multiples must be composite.

Time complexity: O(nloglogn)
Space complexity: O(n)

 */