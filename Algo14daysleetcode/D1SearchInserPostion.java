//Leetcode: 35. Search Insert Position
//Given a sorted array of distinct integers and a target value, 
//return the index if the target is found. If not, return the index where 
//it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

package Algo14daysleetcode;

public class D1SearchInserPostion {
    public static void main(String[] args) {
        int []nums={7,9,12,45,120,150};
        D1SearchInserPostion sip=new D1SearchInserPostion();
        int target=15;
        System.out.println(sip.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid= start+((end-start)/2);
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            
            else{
                return mid;
            }
          

        }
        return start;
        
        
        
        
    }
    
}
