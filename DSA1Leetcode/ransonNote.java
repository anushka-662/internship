import java.util.*;
public class ransonNote {
    public static void main(String[] args) {
        String ransomNote="aabc";
        String magazine="aabbccdd";
        ransonNote rn = new ransonNote();
        System.out.println(rn.canConstruct(ransomNote, magazine));
        //canConstruct(ransomNote, magazine);
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>ransom1=new HashMap<>();
        HashMap<Character,Integer>magazine1=new HashMap<>();
        //For Map1 i.e RansomNote
        for(int i=0;i<ransomNote.length();i++){
            if(ransom1.containsKey(ransomNote.charAt(i))){
                ransom1.put(ransomNote.charAt(i),ransom1.get(ransomNote.charAt(i))+1);
            }
            else{
                ransom1.put(ransomNote.charAt(i),1);
            }
        }
        //Map2 i.e Magazine:
        for(int i=0;i<magazine.length();i++){
            if(magazine1.containsKey(magazine.charAt(i))){
                magazine1.put(magazine.charAt(i),magazine1.get(magazine.charAt(i))+1);
            }
            else{
                magazine1.put(magazine.charAt(i),1);
            }
        }
        //Check the COndition:
        for(Character key: ransom1.keySet()){
            if(!magazine1.containsKey(key)||magazine1.get(key)<ransom1.get(key)){
                return false;
            }
        }
        return true;
       
    
}
}
