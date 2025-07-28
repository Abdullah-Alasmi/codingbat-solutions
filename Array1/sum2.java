public class sum2 {
    public int sum2(int[] nums) {
        int sum = 0;
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return nums[0];
        } else {
            for(int i = 0; i < 2; i++) {
                sum += nums[i];
            }
            return sum;
        }
    }
}
