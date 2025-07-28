public class front11 {
    public int[] front11(int[] a, int[] b) {
        int[] array1 = new int[1];
        int[] array2 = new int[2];
        if (a.length == 0 && b.length == 0) {
            return a;
        }
        if (a.length >= 1 && b.length == 0) {
            array1[0] = a[0];
            return array1;
        }
        if (a.length >= 1 && b.length >= 1) {
            array2[0] = a[0];
            array2[1] = b[0];
            return array2;
        }
        if (a.length == 0 && b.length >= 1) {
            array1[0] = b[0];
            return array1;
        }
        return a;
    }
}
