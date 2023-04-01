//VALID SUDOKU: LEETCODE PROBLEM:36
// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:
// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.
import java.util.*;
public class validSudoku {
    public static void main(String[] args) {
     char[][]board= {{'5','3','.','.','7','.','.','.','.'}
                    ,{'6','.','.','1','9','5','.','.','.'}
                    ,{'.','9','8','.','.','.','.','6','.'}
                    ,{'8','.','.','.','6','.','.','.','3'}
                    ,{'4','.','.','8','.','3','.','.','1'}
                    ,{'7','.','.','.','2','.','.','.','6'}
                    ,{'.','6','.','.','.','.','2','8','.'}
                    ,{'.','.','.','4','1','9','.','.','5'}
                    ,{'8','.','.','.','8','.','.','7','9'}};
    validSudoku vs = new validSudoku();
    System.out.println(vs.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if((!set.add("row"+i+board[i][j]))|| (!set.add("col"+j+board[i][j]))){
                        return false;
                    }
                    if(!set.add("box"+(((i/3)*3)+(j/3))+board[i][j])){
                        return false;
                    }

                }
            }
        }        
        return true;
    }    
}
