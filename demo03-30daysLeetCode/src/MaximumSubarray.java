public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;

        int output = nums[0];
        int sum = 0;
        for (int x : nums) {
            sum += x;
            output = Math.max(sum, output);
//            sum = Math.max(sum, 0);
            if (sum < 0)
                sum = 0;
        }
        return output;
    }

    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        max.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
}
