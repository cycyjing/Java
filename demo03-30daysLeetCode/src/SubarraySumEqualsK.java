public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // solution 1: Time Limit Exceeded
        int output = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];
                if (sum == k)
                    output++;
            }
        }
        return output;
    }
}
