//167. Two Sum II - Input Array Is Sorted
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
//find two numbers such that they add up to a specific target number. 
//Let these two numbers be numbers[index1] and numbers[index2] 
//where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, 
//added by one as an integer array [index1, index2] of length 2.
package Algo14daysleetcode;

import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args) {
        int[]numbers={2,7,8,10,12};
        int target=10;
        twoSum2 ts=new twoSum2();
        System.out.println(Arrays.toString(ts.twoSum(numbers, target)));
        
    }
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[] {i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
        
    }
    
    
}
