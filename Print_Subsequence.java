package Recursion;

import java.util.*;

public class Print_Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        Print(str, "");

    }

    public static void Print(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        Print(ques.substring(1), ans);
        Print(ques.substring(1), ans+ch);

    }
}
