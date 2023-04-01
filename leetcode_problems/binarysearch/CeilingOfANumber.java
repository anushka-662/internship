public class CeilingOfANumber {
    public static void main(String[] args) {
        int[]arr={2,3,6,12,19,50,78,100,250,980};
        int target=1;
        System.out.println( "CEILING NUMBER OF " +target+" IS "+ceilingNumber(arr, target));
        System.out.println( "FLOOR NUMBER OF " +target+" IS "+floorNumber(arr, target));
    }
    
    public static int ceilingNumber (int[]arr,int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end= mid-1;
            }
            else{
                start=mid+1;

            }
        
        }
        return arr[start];
        
    }
    public static int floorNumber (int[]arr,int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end= mid-1;
            }
            else{
                start=mid+1;

            }
        
        }
        return arr[end];
        
    }
}
