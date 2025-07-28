public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];
        if (a.length == 0) {
            newArray[0] = b[0];
            newArray[1] = b[1];
        } else if (a.length == 1) {
            newArray[0] = a[0];
            newArray[1] = b[0];
        } else {
            newArray[0] = a[0];
            newArray[1] = a[1];
        }
        return newArray;
    }
}
