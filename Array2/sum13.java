public class sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        if(nums.length == 0) {
            sum = sum;
        }
        else{
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] == 13) {
                    sum = sum;
                    nums[i + 1] = 0;
                } else {
                    sum += nums[i];
                }
            }

            if(nums[nums.length - 1] != 13)
                sum += nums[nums.length - 1];}
        return sum;
    }
}
