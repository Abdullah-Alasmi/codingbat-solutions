public class sum28 {
    public boolean sum28(int[] nums) {
        int twoCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                twoCount++;
            }
        }
        if(twoCount * 2 == 8) {
            return true;
        } else {
            return false;
        }
    }
}
