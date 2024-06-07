package Recursion;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n = 13;
        Counting(0,n);
    }

    public static void Counting(int curr, int n){
        if(curr > n){
            return;
        }

        System.out.println(curr);
        int i = 0;
        if(curr==0){
            i = 1;
        }
        for(; i<=9; i++){
            Counting(curr*10+i, n);
        }
    }
}
