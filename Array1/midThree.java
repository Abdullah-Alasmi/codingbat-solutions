public class midThree {
    public int[] midThree(int[] nums) {
        int [] newArray = {nums[(nums.length / 2) - 1], nums[(nums.length / 2)], nums[(nums.length / 2) + 1]};
        if(nums.length == 3)
            return nums;
        else
            return newArray;
    }
}
