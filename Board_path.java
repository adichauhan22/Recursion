package Recursion;

import java.util.*;

public class Board_path {
    public static void main(String[] args) {
        int n = 4;
        Print_path(n, 0, "");
    }

    public static void Print_path(int n, int count, String ans){
        if(count == n){
            System.out.println(ans);
            return;
        }
        if(count > n){
            return;
        }
        
        Print_path(n, count+1, ans+"1");
        Print_path(n, count+2, ans+"2");
        Print_path(n, count+3, ans+"3");

        return ;
    }
}
