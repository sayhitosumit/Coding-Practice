public class Solution {


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
