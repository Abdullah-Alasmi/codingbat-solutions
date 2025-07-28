public class makeLast {
    public int[] makeLast(int[] nums) {
        int [] newArray = new int[nums.length * 2];
        for(int i = 0; i < newArray.length - 2; i++) {
            newArray[i] = 0;
        }
        newArray[newArray.length - 1] = nums[nums.length - 1];
        return newArray;
    }
}
