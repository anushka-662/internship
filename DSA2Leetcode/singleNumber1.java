//Leetcode: 136. Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: nums = [2,2,1]
//Output: 1
public class singleNumber1 {
    public static void main(String[] args) {
        int[]nums={2,2,5,1,4,5,4};
        singleNumber1 sn=new singleNumber1();
        System.out.println(sn.singleNumber(nums));
        
    }
   
    public int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count^nums[i];
        }
        return count;
        
    }
    
}
