public class double23 {
    public boolean double23(int[] nums) {
        int count = 0;
        int counter = 0;
        for(int i : nums) {
            if(i == 2)
                count++;
            if(i == 3)
                counter++;
        }
        if(count == 2) {
            return true;
        } else if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}
