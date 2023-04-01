//Missing Number
//LeetCode Problem No:268
//Given an array nums containing n distinct numbers in the range [0, n], 
//return the only number in the range that is missing from the array.
package leetcode_problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[]nums={8,6,4,2,3,5,7,0,1};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
        
        
    }
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
        
    }
    static void swap(int[] nums,int i, int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;

    }
    
}
