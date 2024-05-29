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


    public static void main(String[] args) {

    }
}
