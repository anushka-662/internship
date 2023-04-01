package binarySearch;

public class orderAgnosticsBS {
    public static void main(String[] args) {
        int[]arr={-2,3,6,12,19,50,78,100,250,980};
        int[]arr2={1000,950,782,256,45,12,7,6,-1};
        int target=12;
        System.out.println( binarySearch(arr2, target));
    }
    
    public static int binarySearch(int []arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];//checking if array is sorted in ascending
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){//if array is ascending
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{//if array is descending
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }
        return -1;

    }
    
}
