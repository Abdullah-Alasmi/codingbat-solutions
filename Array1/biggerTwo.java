public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i : a) {
            sum1 += i;
        }
        for(int i : b) {
            sum2 += i;
        }
        if(sum1 == sum2)
            return a;
        if(sum1 > sum2)
            return a;
        if(sum2 > sum1)
            return b;
        return a;
    }
}
