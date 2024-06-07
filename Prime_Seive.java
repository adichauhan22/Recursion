package Recursion;

import java.util.*;

public class Prime_Seive {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(countPrime(n));
    }

    public static int countPrime(int n){
        int[] prime = new int[n+1];
        prime[0] = 1;
        prime[1] = 1;
        for(int i=2; i*i <= n; i++){
            if(prime[i]==0){
                for(int j=2; i*j < prime.length; j++){
                    prime[i*j] = 1;
                }
            }
        }

        int ans = 0;
        for(int i=2; i<prime.length; i++){
            if(prime[i]==0){
                ans++;
            }
        }
        return ans;
    }
}
