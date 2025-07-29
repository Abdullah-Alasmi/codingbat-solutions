public class maxSpan {
    public int maxSpan(int[] nums) {

        if(nums.length == 0)
            return 0;

        int maxLength = 1;
        int i = 0;
        int j = nums.length - 1;

        while(j-i+1 > maxLength)
        {

            int k = j;

            while((i < k) && (k-i+1 > maxLength))
            {
                if(nums[i] == nums[k])
                    maxLength = k-i+1;
                k--;
            }

            i++;
        }

        return maxLength;
    }
}
