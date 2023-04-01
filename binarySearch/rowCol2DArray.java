import java.util.Arrays;

public class rowCol2DArray {
    public static void main(String[] args) {
        //Array Sorted in Row and Column Wise
        //Time Complexity=O(N)
        int[][]arr={
            {2,3,4,5},
            {10,20,30,40},
            {15,25,35,45},
        
        };
        int target=25;
        System.out.println(Arrays.toString(Array2D(arr,target)));
    }
    public static int[]Array2D(int[][]arr,int target) {
        int row=0;
        int col=arr.length-1;
        while(row<arr.length&&col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};

            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
          
        }
     
        return new int[]{-1,-1};
    }
    
}
