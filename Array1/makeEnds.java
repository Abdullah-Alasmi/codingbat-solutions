public class makeEnds {
    public int[] makeEnds(int[] nums) {
        int [] newArray = new int[2];
        if(nums.length == 1) {
            newArray[0] = nums[0];
            newArray[1] = nums[0];
            return newArray;
        } else {
            newArray[0] = nums[0];
            newArray[1] = nums[nums.length -1];
            return newArray;
        }
    }
}
