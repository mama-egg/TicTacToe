import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        
        int[][] grid = new int[3][3]; //create board
        
        InitBoard(board); //initialize board
        
        Scanner scan = new Scanner(System.in); //create Scanner scan
        
        int numTurns = 0;//create int numTurns to represent number of turns
        int player = -1; //create int player
        int winner = 0; //create int winner
        
        // create main playing loop
        for()
            
            // create control value validMove to check for valid move and retry if not
            
            // loop until user enters valid input

                // print input prompts
                System.out.println("Enter your move as an integer from 1..9:");
                System.out.println(" 1 | 2 | 3");
                System.out.println("---|---|---");
                System.out.println(" 4 | 5 | 6");
                System.out.println("---|---|---");
                System.out.println(" 7 | 8 | 9");
                
                // get user input from scanner
                
                // if move isn't valid, notify user to try again
            
            // print the current state of the game board
            
            // check for winner, toggle player and increment number of turns taken
        
        // print win, lose, tie results
        
        input.close();
    }
    
    public static void InitBoard(int[][] grid) {
       
    }
    
    public static void PrintBoard(int[][] grid) {

    }
    
    public static int WinTieLose(int[][] grid) {
        int result = 0;        
        
        return result;
    }
    
    public static int WinningRow(int[][] grid) {
        int result = 0;

        return result;
    }
    
    public static int WinningCol(int[][] grid) {
        int result = 0;

        return result;
    }
    
    public static int WinningDiagonal(int[][] grid) {
        int result = 0;

        return result;
    }
    
    public static boolean TakeTurn(int[][] grid, int position, int player) {
        boolean result = false;

        return result;
    }
}
