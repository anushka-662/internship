package Algo14daysleetcode;
public class reverseStringl {
    public static void main(String[] args) {
        char[]s={'h','e','l','l','o'};
        reverseStringl rs =new reverseStringl();
        rs.reverseString(s);
        
    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char temp;
        while(i<j){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println(s);
        
    }
    
}
