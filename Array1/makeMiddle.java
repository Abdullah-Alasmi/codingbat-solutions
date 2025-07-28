public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int [] newArray = new int[2];
        newArray[0] = nums[nums.length / 2 - 1];
        newArray[1] = nums[nums.length / 2];

        return newArray;
    }
}
