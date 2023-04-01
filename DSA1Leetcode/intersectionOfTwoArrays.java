//Intersection of Two Arrays
//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
import java.util.*;
public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1,4,4,6,8};
        int []nums2={2,2,1,6};
        intersectionOfTwoArrays ita=new intersectionOfTwoArrays();
        System.out.println(Arrays.toString(ita.intersect(nums1, nums2)));
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Set<Integer>set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }

        Set<Integer>set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }

        set1.retainAll(set2);
        int[]ans=new int[set1.size()];
        int temp=0;
        for(int num:set1){
            ans[temp]=num;//0th index of ans ke aayega set ka 1st element
            temp++;
        }
        return ans;
        
    }
}
