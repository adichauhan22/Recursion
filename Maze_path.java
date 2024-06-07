package Recursion;

public class Maze_path {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        Printpath(n-1, m-1, 0, 0, "");

    }


    // er = end row
    // cc = current column
    
    public static void Printpath(int er, int ec, int cr, int cc, String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr > er || cc > ec){
            return;
        }

        Printpath(er, ec, cr, cc+1, ans+"H");
        Printpath(er, ec, cr+1, cc, ans+"V");

    }
}
