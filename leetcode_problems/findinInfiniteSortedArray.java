//Binary Search in an infinite Sorted Array

package leetcode_problems;

public class findinInfiniteSortedArray {
    public static void main(String[] args) {
        int[]arr={2,3,6,12,19,50,78,100,250,980};
        int target=19;
        System.out.println(ans(arr, target));
    }
    public static int ans(int[]arr,int target) {
        //start with a box of size 2
        int start=0;
        int end=1;
        //condition for target to lie in the range
        while(target>arr[end]){
            int temp=end+1;
            //doubling the size of the box
            end=end+(end-start+1)*2;
            start=temp;
        }

        return(binarySearch662(arr, target,start,end));
    }
    public static int binarySearch662(int[]arr,int target,int start,int end) {
       
       
        while(start<=end){
            //finding the middle element
            int mid = start+((end-start)/2);
            if(target<arr[mid]){
                end=mid-1; 
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
