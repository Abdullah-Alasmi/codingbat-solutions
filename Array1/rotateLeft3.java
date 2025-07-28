public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int num = nums[0];

        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = num;

        return nums;
    }
}
