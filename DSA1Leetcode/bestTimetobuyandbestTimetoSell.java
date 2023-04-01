// Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to 
//buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. 
//If you cannot achieve any profit, return 0.
import java.util.*;
public class bestTimetobuyandbestTimetoSell {
    public static void main(String[] args) {
    int[]prices={7,5,4,2,1};
    bestTimetobuyandbestTimetoSell bts=new bestTimetobuyandbestTimetoSell();
    System.out.println(bts.maxProfit(prices));

        
    }
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int maxSoFar=0;
        for(int i=0;i<prices.length;i++){
            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxSoFar=Math.max(maxSoFar,profit);


        }
        return maxSoFar;
    }

    
    
}
