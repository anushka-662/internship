import java.util.*;
public class intersectionOfArray2 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1,4,4,6,8};
        int []nums2={2,2,1,6};
        intersectionOfArray2 ita=new intersectionOfArray2();
      
        System.out.println(Arrays.toString(ita.intersect(nums1, nums2)));

      
    
    }
    public int[]intersect(int[] nums1, int[] nums2) {
    //     //Declaring Maps
    //     HashMap<Integer,Integer>map=new HashMap<>();
    
    //     ArrayList<Integer>arr=new ArrayList<>();
    
       
    // //    //Inserting Elements of Arrays to Maps
    //     //For Map1
       
    //      //Iterating nums2 and adding common elements to arraylist
    //      for(int j=0;j<nums2.length;j++){
    //         if(map.containsKey(nums2[j])&& map.get(nums2[j])>0){
    //             arr.add(j);
    //             map.put(nums2[j], map.get(nums2[j])-1);
                 
    //         }
    //      }
    //      int[]ans=new int [arr.size()];
    //      for(int k = 0; k < arr.size(); k++)
    //      {
    //          ans[k] = arr.get(k);
    //      }
          
    //     return ans;
    // //    
    HashMap<Integer, Integer> map = new HashMap<>(); // It will store elements of nums1.
    ArrayList<Integer> list = new ArrayList<>(); // It will store common elements of nums1 and nums2.

        //declare i so that it can be used further. (saves space)
        int i; 
        
        //traverse the array nums1, store element in Key and store its frequency in Value.        
        for(int j=0;j<nums1.length;j++){
         if(map.containsKey(nums1[j])){
            map.put(nums1[j],map.get(nums1[j])+1);
       }
        else{
             map.put(nums1[j],1);
         }
     }

        //traverse the array nums2 and check for common elements.
        for(i = 0; i < nums2.length; i++)
        {
            // We need to check two conditions:
            // 1. map should contain nums2[i] element.
            // 2. freq of nums2[i] element must be greater than 1.
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {                
                list.add(nums2[i]);                         // add it to arraylist.
                map.put(nums2[i], map.get(nums2[i])-1);     // decrease its freq in map.
            }
        }
        // create a new array of list size.
        int [] arr = new int[list.size()];

        
        // traverse the list and add elements in the array.
        for(i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        // finally, return the resultant array.
        return arr;
  
       

        
     
        

       

   
    }
}
