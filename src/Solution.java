import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        ArrayList<Integer>   arrayList = new ArrayList<>(nums.length);
        int count=0;
        for (int i :
                nums) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);

        for (int i :
                arrayList) {
            if(arrayList.contains(k-i)){
                count++;
                int noToRemove = arrayList.indexOf(k-1);
                arrayList.remove(noToRemove);
            }
        }
        return count;
    }

    // s = "leetcode", k = 3
    public int maxVowels(String s, int k) {
        int maxlength=0;
        int noOfVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i<k){
              boolean v =  isVowel(s.charAt(i));
              if(v) noOfVowels++;
            } else {
                boolean v  =  isVowel(s.charAt(i));
                if(v) noOfVowels++;
                boolean checkLast = isVowel(s.charAt(i-k));
                if(checkLast) noOfVowels--;
            }
            maxlength = Math.max(maxlength,noOfVowels);

        }
        
       return maxlength;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    //  Input: s = "abc", t = "ahbgdc"    sfdsadfdfbdfdcd
    // Input: s = "axc", t = "ahbgdc"
    public boolean isSubsequence(String s, String t) {

        int i=0;
        int j =0;
        if(s.length()==0) return true;
       while (i<s.length()){

           while (j<t.length()){
               if(s.charAt(i)==t.charAt(j)) {
                   i++;
                   if(i==s.length()) return true;
               }
               j++;
           }
           return false;


       }

        return false;
    }

    public static void main(String[] args) {

    }
}
