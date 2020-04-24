import java.util.ArrayList;
import java.util.List;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // solution 1: Time Limit Exceeded
//        int output = 0;
//        for (int start = 0; start < nums.length; start++) {
//            for (int end = start + 1; end <= nums.length; end++) {
//                int sum = 0;
//                for (int i = start; i < end; i++)
//                    sum += nums[i];
//                if (sum == k)
//                    output++;
//            }
//        }
//        return output;

        // solution 2
//        List<Integer> list = new ArrayList<>();
//        list.add(0, 0);
//        int output = 0, sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            list.add(i + 1, sum);
//        }
//        for (int start = 0; start < nums.length; start++) {
//            for (int end = start + 1; end <= nums.length; end++) {
//                if (list.get(end) - list.get(start) == k)
//                    output++;
//            }
//        }
//        return output;

        // solution 3
        int output = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k)
                    output++;
            }
        }
        return output;
    }
}
