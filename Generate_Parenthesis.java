package Recursion;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        Generate(n, 0, 0, "");
    }

    public static void Generate(int n, int open, int close, String ans){
        if(open == n && close == n){
            System.out.println(ans);
        }

        if(open > n || close > open){
            return;
        }

        Generate(n, open+1, close, ans+"(");
        Generate(n, open, close+1, ans+")");

        return;
    }
}
