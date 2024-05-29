public class testSolution {

    public int longestOnes(int[] nums, int k) {

        int longest=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==1){
               int count =0;
               int kd=k;
                for (int j = i; j < nums.length; j++) {
                    if(nums[j]==1) {
                        count++;
                    }
                    else {
                        if(kd>0) {
                            count++;
                            kd--;
                        }
                        else {
                            longest=Math.max(longest,count);
                            break;
                        }

                    }

                }
            } else {
                int count =0;
                int kd=k-1;
                int flag=0;
                for (int j = i; j < nums.length; j++) {
                    if(nums[j]==1) {
                        count++;
                        if(flag==0) count++;
                        flag=1;
                    }
                    else {
                        if(kd>0) {
                            count++;
                            kd--;
                        }
                        else {
                            longest=Math.max(longest,count);
                            break;
                        }

                    }

                }

            }
        }

       return longest;
    }


    public static void main(String[] args) {

    }
}
