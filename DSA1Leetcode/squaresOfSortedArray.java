//977. Squares of a Sorted Array
//Given an integer array nums sorted in non-decreasing order, 
//return an array of the squares of each number sorted in non-decreasing order.
import java.util.*;
public class squaresOfSortedArray {
    public static void main(String[] args) {
        int []nums={-4,-2,-1,0,2,4,6};
        squaresOfSortedArray sosa=new squaresOfSortedArray();
        System.out.println(Arrays.toString(sosa.sortedSquares(nums)));
        
    }
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[start]>nums[end]){
                result[i]=nums[start];
                start++;

            }
            else{
                result[i]=nums[end];
                end--;

            }
           
        }
        return result;
    }
}
        
    
    

