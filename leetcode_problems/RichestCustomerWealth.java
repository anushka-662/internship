/* LEETCODE
1672. Richest Customer WealthYou are given an m x n integer grid accounts where accounts[i][j] is the 
amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth. */
package leetcode_problems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][]accounts={
            {12,6,4,60},
            {5,8,23},
            {3,27,56}
        };
        System.out.println(maxWealth(accounts));
    }
    public static int maxWealth(int [][]arr) {
        int max=0;
        for(int person=0;person<arr.length;person++){
            int sum=0;
            for(int account=0;account<arr[person].length;account++){
                sum+=arr[person][account];
            }
            if(max<sum){
                max=sum;
            }

        }
        return max;
        
    }
    
}
