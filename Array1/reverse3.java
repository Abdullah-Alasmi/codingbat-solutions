public class reverse3 {
    public int[] reverse3(int[] nums) {
        int [] array = new int[3];
        int count = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            array[count] = nums[i];
            count++;
        }
        return array;
    }
}
