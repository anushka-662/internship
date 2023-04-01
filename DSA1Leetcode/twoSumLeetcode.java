import java.util.*;
public class twoSumLeetcode {
    public static void main(String[] args) {
        int[] nums={12,6,4,5};
        int target=20;
        twoSumLeetcode ts = new twoSumLeetcode();
        int[]ans=ts.twoSum(nums, target);
        // System.out.println(ts.twoSum(nums,target));
        System.out.println(Arrays.toString(ans));
    }
    
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
        
    }
}
