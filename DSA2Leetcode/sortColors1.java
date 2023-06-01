//75. Sort Colors
//Given an array nums with n objects colored red, white, or blue, 
//sort them in-place so that objects of the same color are adjacent, 
//with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.

import java.util.*;

public class sortColors1 {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sortColors1 sc=new sortColors1();
      sc. sortColors(arr);
        System.out.println(Arrays.toString(arr));
       
    }

    public void sortColors(int[] nums) {
        boolean swapped=false;
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<nums.length-i;j++){
                    if(nums[j]<nums[j-1]){
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                        swapped=true;
                    }
                }
                if(swapped!=true){
                    break;
                }
            }
            
    }
    
}
