public class bigDiff {
    public int bigDiff(int[] nums) {
        int largest = 0;
        for(int i: nums) {
            if(i > largest) {
                largest = i;
            }
        }
        int smallest = largest;
        for(int j: nums) {
            if(j < smallest) {
                smallest = j;
            }
        }
        return largest - smallest;
    }
}
