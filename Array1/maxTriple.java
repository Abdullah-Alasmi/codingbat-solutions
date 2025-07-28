public class maxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];
        if(nums[nums.length / 2] > max)
            max = nums[nums.length / 2];
        if(nums[nums.length - 1] > max)
            max = nums[nums.length - 1];
        return max;
    }
}
