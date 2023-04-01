import java.util.*;
public class firstUniqueChar{
    public static void main(String[] args) {
        String s="aabb";
        firstUniqueChar fuc=new firstUniqueChar();
        System.out.println(fuc.firstUniqChar(s));
    }
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        //Inserting elements of String in Map and their frequency
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        
        int index;
        for(index=0;index<s.length();index++){
            if(map.get(s.charAt(index))==1){
                return index;

            }

    }
    return -1;
   
}
}


