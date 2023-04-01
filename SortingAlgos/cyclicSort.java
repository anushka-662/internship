//Use Cyclic Sort when the Range is given like 0-N or 1-N
//Makes N-1 swaps
//Time Complexity: O(N)
import java.util.*;
public class cyclicSort {
    public static void main(String[] args) {
        int []arr={3,2,1,7,8,6,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
   static void sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

    }
     static void swap(int[]arr,int i, int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    
}
