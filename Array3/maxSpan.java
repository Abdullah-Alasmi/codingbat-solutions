public class maxSpan {
    public int maxSpan(int[] arr) {
        if (arr.length == 0) return 0;

        Map<Integer, int[]> positions = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (!positions.containsKey(value)) {
                positions.put(value, new int[]{i, i});
            } else {
                positions.get(value)[1] = i;
            }
        }

        int maxSpan = 0;
        for (int[] pos : positions.values()) {
            int span = pos[1] - pos[0] + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }

        return maxSpan;
    }
}
