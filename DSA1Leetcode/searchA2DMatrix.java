//Search2DArray
//Given an integer target, return true if target is in matrix or false otherwise.
public class searchA2DMatrix {
    public static void main(String[] args) {
     //int[][]matrix = {{1,3,5,7},
                // {10,11,16,20},
                // {23,30,34,60}};
        int matrix[][]={{1,3}};
        int target = 3;
        searchA2DMatrix sm=new searchA2DMatrix();
        System.out.println(sm.searchMatrix(matrix, target));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        System.out.println("matrix:"+matrix.length);
        while(row<matrix.length& col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }    
    
}
