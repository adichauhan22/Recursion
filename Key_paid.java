package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Key_paid {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        String ques = "23";
        Print(ll,ques, "");
        System.out.println(ll);
    }

    public static void Print(List<String> ll, String ques, String ans){
        if(ques.length()==0){
            ll.add(ans);
            //System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = key[ch-'0'];
        for(int i=0; i<press.length(); i++){
            Print(ll,ques.substring(1), ans+press.charAt(i));
        }
    }
}
