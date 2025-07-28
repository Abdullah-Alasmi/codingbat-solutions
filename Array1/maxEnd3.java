public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int length = nums.length - 1;
        int first = nums[0];
        int last = nums[length];

        if(first > last) {
            for(int i = 0; i < length; i++) {
                nums[i] = first;
            }
            nums[length] = first;
        } else {
            for(int i = 0; i < length; i++) {
                nums[i] = last;
            }
        }
        return nums;
    }
}
