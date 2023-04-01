import java.util.*;
public class mergeSortedArray {
    public static void main(String[] args) {
       int[]nums1= {0};
       int m=0;
       int[]nums2= {1};
       int n=1;

        mergeSortedArray msa=new mergeSortedArray();
        msa.merge(nums1, m, nums2, n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0&& nums1[i]>nums2[j]){
                nums1[k]=nums1[i];

                i--;
                k--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }

        }
        System.out.println(Arrays.toString(nums1));
    
}
}
