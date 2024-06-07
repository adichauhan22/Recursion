package Recursion;

public class Count_subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.print("\n"+Count_sub(str, ""));

    }

    public static int Count_sub(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }

        char ch = ques.charAt(0);
        int x = Count_sub(ques.substring(1), ans);
        int y = Count_sub(ques.substring(1), ans+ch);
        return x + y;

    }
}
