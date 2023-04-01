import java.util.Arrays;

public class linearSearch{
    public static void main(String[] args) {
        System.out.println("Hi");
        int []array={12,6,2,14,8,9};
        int target=9;
        linearSearchAlgo(array, target);
        int[][]arr2D={
            {12,6,4,60},
            {5,8,23},
            {3,27,56}
        };
        int tar2D=100;
        int[]ans=searchIn2DArray(arr2D, tar2D);
        if(ans[0]==-1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println(Arrays.toString(ans));
        }
        
    }
    public static void linearSearchAlgo(int[]array, int targetElement) {
        if(array.length==0){
            System.out.println("Array is Empty");
        }
        else if(array.length!=0){
            
            for(int index=0;index<array.length;index++){
                int temp= array[index];
                if(temp==targetElement){
                    System.out.println("The element is at index "+ index);
                }
            }
        }
        else{
            System.out.println("Element not found");
        }
        
    }

    public static int[] searchIn2DArray(int[][]arr,int target) {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
        
    }
}