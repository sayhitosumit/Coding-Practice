import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
