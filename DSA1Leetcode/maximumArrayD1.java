//Maximum Subarray
//Given an integer array nums, find the contiguous subarray with the largest sum, and return its sum.
//Using Kadane's Algorithm
public class maximumArrayD1 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        maximumArrayD1 ma = new maximumArrayD1();
        System.out.println(ma.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
    //    int maxSum=Integer.MIN_VALUE;
    //    int currentSum=0;
    //    for(int i=0;i<nums.length;i++){
    //     currentSum=Math.max(currentSum+nums[i],nums[i]);
    //     maxSum=Math.max(currentSum,maxSum);
       
    //    }
    //    return maxSum;
   
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <nums.length; i++) {
            currSum = currSum+ nums[i];

            if (currSum > maxSum) {
            maxSum = currSum;
            }

            if (currSum < 0) {
            currSum = 0;
            }
        }

        return maxSum;
     
        
    }
    
}
