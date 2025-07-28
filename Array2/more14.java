public class more14 {
    public boolean more14(int[] nums) {
        int fourCount = 0;
        int oneCount = 0;
        for(int element: nums) {
            if(element == 4) {
                fourCount++;
            } else if(element == 1) {
                oneCount++;
            }
        }
        if(oneCount > fourCount) {
            return true;
        } else {
            return false;
        }
    }
}
