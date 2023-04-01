package SearchingAlgos;
//Bubble Sort
//Time Complexity is O(N^2)-Best case: O(N), Worst caseO(N^2)
//Space Complexity isO(N)
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={-1,0,1};
       BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    public static void BubbleSort(int []arr) {
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped!=true){
                break;
            }
        }
        
    }
}
