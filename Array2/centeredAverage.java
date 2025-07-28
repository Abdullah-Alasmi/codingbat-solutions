public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int result = 0;
        int largest = nums[0];
        int smallest = nums[0];

        for(int i: nums) {
            result += i;

            if(i > largest) {
                largest = i;
            }
            if(i < smallest) {
                smallest = i;
            }
        }
        result -= (largest + smallest);
        return result /= (nums.length - 2);
    }
}
