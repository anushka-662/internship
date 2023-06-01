//


import java.util.HashMap;

public class majorityElement1 {
    public static void main(String[] args) {
        int[]nums={2,2,1,1,1,2,2};
        majorityElement1 me=new majorityElement1();
        System.out.println(me.majorityElement(nums));
        
        
    }
    //Using HashMaps
     //With Time Complexity: O(N) and space Complexity: O(N)
    public int majorityElementfirstApproach(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        float temp=nums.length/2;
        int ans=1;
    
        for(int key:map.keySet()){
            if(map.get(key)>temp){
                ans=key;
            }
        }
        return ans;
    }
    //second Approach
    //Using Moore's voting Algorithm
    //With Time Complexity: O(N) and space Complexity: O(1)
    public int majorityElement(int[] nums) {
        int votes=1;
        int majority=nums[0];
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(majority==nums[i]){
                votes++;

            }
            else{
                votes--;
            }
        }
        return majority;
    }
}
