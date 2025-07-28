public class no14 {
    public boolean no14(int[] nums) {
        int one = 0;
        int four = 0;
        for(int element: nums) {
            if(element == 1) {
                one++;
            }
            if(element == 4) {
                four++;
            }
        }
        if(one == 0) {
            return true;
        } else if(four == 0) {
            return true;
        } else {
            return false;
        }
    }
}
