package Leetcode;

public class SudokuSolver {

	 public void solveSudoku(char[][] board) {
	        
	        int row = 0, col = 0;
	        int grp[][] = new int[3][3];
	        
	        for(int i = 0; i < 9; i++){
	            for(int j = 0; j < 9; j++){
	                char c = board[i][j];
	                if(board[i][j]!='.'){
	                    int shift = 1 << (c-'0');
	                    row = row | shift;
	                    col = col | shift;
	                    grp[i/3][j/3] =  grp[i/3][j/3] | shift;
	                }
	            }
	        }
	        
	        for(int i = 0; i < 9; i++){
	            for(int j = 0; j < 9; j++){
	                
	            }
	        }
	    }
	
}
