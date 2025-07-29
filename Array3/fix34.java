public class fix34 {
    public int[] fix34(int[] arr) {
        int[] result = new int[arr.length];
        java.util.ArrayList<Integer> others = new java.util.ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                result[i] = 3;
            } else if (arr[i] != 4) {
                others.add(arr[i]);
            }
        }

        int fourIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (result[i] == 3) {
                result[i + 1] = 4;
            }
        }

        int otherIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (result[i] == 0) {
                result[i] = others.get(otherIndex++);
            }
        }

        return result;
    }
}
