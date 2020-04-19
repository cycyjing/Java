import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // solution 1
//        if (nums == null || nums.length < 1)
//            return 0;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (list.contains(nums[i]))
//                list.remove(new Integer(nums[i]));
//            else
//                list.add(nums[i]);
//        }
//        return list.get(0);

        // solution 2
//        Map<Integer, Boolean> map = new HashMap<>();
//        for (int i : nums)
//            if (map.containsKey(i))
//                map.remove(i);
//            else
//                map.put(i, true);
//        for (Map.Entry<Integer, Boolean> entry : map.entrySet())
//            return entry.getKey();
//        return 0;

        // solution 3
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        for (int i : nums) {
//            if (map.get(i) == 1) {
//                return i;
//            }
//        }
//        return 0;

        // solution 4: 2∗(a+b+c)−(a+a+b+b+c)=c
//        int sumOfNums = 0, sumOfSet = 0;
//        Set<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            if (!set.contains(i)) {
//                set.add(i);
//                sumOfSet += i;
//            }
//            sumOfNums += i;
//        }
//        return 2 * sumOfSet - sumOfNums;

        // solution 5

    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(new int[]{2, 2, 1}));
    }
}
