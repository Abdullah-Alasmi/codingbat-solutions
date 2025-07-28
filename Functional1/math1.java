public class math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (1 + n) * 10);
        return nums;
    }
}
