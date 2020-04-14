import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
//        if (nums.length > 50000) return 0;
//        int max = 0;
//        for (int start = 0; start < nums.length; start++) {
//            int zeroes = 0, ones = 0;
//            for (int end = start; end < nums.length; end++) {
//                if (nums[end] == 0) {
//                    zeroes++;
//                } else {
//                    ones++;
//                }
//                if (zeroes == ones) {
//                    max = Math.max(max, end - start + 1);
//                }
//            }
//        }
//        return max;

        // 0:-1, 1:+1, find same result
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                max = Math.max(max, i - map.get(count));
            } else {
                map.put(count, i); // first position
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContiguousArray ca = new ContiguousArray();
        System.out.println(ca.findMaxLength(new int[]{0, 1, 0}));
        System.out.println(ca.findMaxLength(new int[]{0, 1, 0, 0, 1, 1, 0}));
    }

}
