//Leetcode 

package Algo14daysleetcode;

public class D1BinarySearch {
    public static void main(String[] args) {
        int []nums={7,9,12,45,120,150};
        D1BinarySearch bs = new D1BinarySearch();
        int target=120;
        System.out.println(bs.search(nums, target));
    }
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+((end-start)/2);
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
        return -1;

        






    }

    
}
