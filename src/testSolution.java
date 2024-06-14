import java.util.*;

public class testSolution {

    public int longestOnes(int[] nums, int k) {

        int max = 0;
        int l = 0;
        int r = 0;
// nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        while (r < nums.length) {

            if (nums[r] == 0) k--;

            while (k < 0) {
                if (nums[l] == 0) k++;
                l++;
            }
            max = Math.max(max, r - l + 1);
          r++;

        }
        return max;
    }
    public int largestAltitude(int[] gain) {
        int altitude =0;
        int highestAltitude =0;

        for (int i = 0; i <gain.length ; i++) {
        altitude+=gain[i];
        if(altitude>highestAltitude) highestAltitude = altitude;


        }


        return highestAltitude;
    }


    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i :arr ) {
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i,1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
             if(map2.containsValue(entry.getValue())) return false;
             else map2.put(entry.getKey(),entry.getValue());

        }


        return true;
    }



    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;

        }
        for (int i = 0; i < word1.length(); i++) {
            if(freq1[i]!=freq2[i]) return false;
        }



        return true;

    }




    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> diff1 = new HashSet<>();
        Set<Integer> diff2 = new HashSet<>();
        List<Integer> diff3 = new ArrayList<>();
        List<Integer> diff4 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i :
                nums1) {
            diff1.add(i);
        }

        for (int i :
                nums2) {
            diff2.add(i);
        }

        for (int i :
                diff1) {
            if(!diff2.contains(i)) diff3.add(i);
        }
        for (int i :
                diff2) {
            if(!diff1.contains(i)) diff4.add(i);
        }

        list.add(diff3);
        list.add(diff4);

        return list;

    }

    public static void main(String[] args) {

    }
}
