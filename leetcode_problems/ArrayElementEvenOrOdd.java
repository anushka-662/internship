/*Given an array nums of integers, return how many of them contain an even number of digits.*/
package leetcode_problems;
import java.util.Scanner;
public class ArrayElementEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TOTAL NUMBER OF ELEMENTS");
        int total=sc.nextInt();
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        int [] arr=new int[total];
        for(int i=0;i<total;i++){
            arr[i]= sc.nextInt();

        }

        System.out.println("TOTAL ELEMENTS WITH EVEN NUMBER OF DIGITS ARE "+totalNoOfDigits(arr));
        
    }
    public static int countNoOfDigits (int num) {
        int count=0;
        if(num<0){
            num=-1*num;
        }
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    /*******SHORTCUT TO COUNT THE NUMBER OF DIGITS IN A NUMBER************* */
    public static int countNoOfDigits2 (int num) {
        return (int)(Math.log10(num))+1;
    }
    /********************************************************************** */
    public static boolean digitsEvenOrOddn(int num) {
        int count=countNoOfDigits2(num);
        if(count==0){
            return false;
        }
        if(count%2==0){
            return true;
        }
        return false;
        
        
    }
    public static int totalNoOfDigits(int[]arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(digitsEvenOrOddn(arr[i])== true){
                ans++;
            }
        }
        return ans;

        
    }
}
