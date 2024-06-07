package Recursion;

import java.util.*;

public class Rat_chase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<s.length(); j++){
                maze[i][j] = s.charAt(j);
            }
        }

        int[][] ans = new int[n][m];
        Maze_path2(maze, 0, 0, ans);
        if(c==0){
            System.out.println("Path not found");
        }

    }

    static int c = 0;
    public static void Maze_path2(char[][] maze, int cr, int cc, int[][] ans){
        if(cr >= maze.length || cr < 0 || cc < 0 || cc >= maze[0].length || maze[cr][cc]=='X'){
            return;
        }

        maze[cr][cc]='X';
        ans[cr][cc]=1;
        if(cr==maze.length-1 && cc==maze[0].length-1){
            Display(ans);
            c++;
            return;
        }

        Maze_path2(maze, cr-1, cc, ans); // up
        Maze_path2(maze, cr+1, cc, ans); //down
        Maze_path2(maze, cr, cc-1, ans); //left
        Maze_path2(maze, cr, cc+1, ans); //right
        maze[cr][cc]='0';
		ans[cr][cc]=0;
    }

    public static void Display(int[][] ans){
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
			System.out.println();
        }
    }
}
