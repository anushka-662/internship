//56. Merge Intervals
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
//and return an array of the non-overlapping intervals that cover all the intervals in the input.

import java.util.*;
public class mergeIntervals1 {
    public static void main(String[] args) {
        int [][]intervals={{1,3},{2,6},{8,10},{15,18}};
        mergeIntervals1 mi = new mergeIntervals1();
        System.out.println(Arrays.toString(mi.merge(intervals)));
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList <int[]> list=new ArrayList<>();
        for(int[] interval:intervals){
            if(list.size()==0){
                list.add(interval);
            }
            else{
                int preinterval[]=list.get(list.size()-1);
                if(interval[0]<=preinterval[1]){
                    preinterval[1]=Math.max(preinterval[1],interval[1]);
                }
                else{
                    list.add(interval);
                }
             }

        }
        return list.toArray(new int[list.size()][]);
        
    }
    
}
