public class only14 {
    public boolean only14(int[] nums) {
        int count = 0;
        for(int element: nums) {
            if(element != 4 && element != 1) {
                count++;
            }
        }
        if(count > 0) {
            return false;
        } else {
            return true;

        }
    }
}
