public class min_max {
    public static void main(String[] args) {
        int []array={12,6,2,14,8,9};
        System.out.println( "Minimum Element in the Array is "+minElement(array));
        System.out.println( "Maximum Element in the Array is "+maxElement(array));
        int[][]arr2D={
            {12,6,4,60},
            {5,8,23},
            {3,27,56}
        };
        System.out.println("Minimum Element in the 2D Array is "+minIn2DArray(arr2D));
        System.out.println("Maximum Element in the 2D Array is "+maxIn2DArray(arr2D));
        
    }
    public static int minElement(int[]arr){
        int min= arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]<min){
                min=arr[index];
            }
        }
        return min;
    }

    public static int maxElement(int[]arr){
        int max= arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]>max){
                max=arr[index];
            }
        }
        return max;
    }

    public static int minIn2DArray(int[][]arr) {
        int min=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
        
    }

    public static int maxIn2DArray(int[][]arr) {
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
        
    }
   
   
   
    
}
