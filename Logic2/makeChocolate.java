public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if (small + big * 5 < goal) {
            return -1;
        }

        int maxBig = Math.min(goal / 5, big);

        int remaining = goal - maxBig * 5;

        if (remaining <= small) {
            return remaining;
        }

        return -1;
    }
}
