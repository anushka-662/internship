//Leetcode: 283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining 
//the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
package Algo14daysleetcode;
import java.util.Arrays;
public class moveZeroesl {
    public static void main(String[] args) {
        int[]nums={2,0,3,7,8,0,0,12,14};
        moveZeroesl mz=new moveZeroesl();
        mz.moveZeroes(nums);
      
    }
    public void moveZeroes(int[] nums) {
       int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        
        
    }
    while(j<nums.length){
        nums[j++]=0;
        
    }
    System.out.println(Arrays.toString(nums));
}
    
}
