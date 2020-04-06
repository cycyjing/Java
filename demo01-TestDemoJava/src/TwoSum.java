import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        // solution 1: bad Performance!!!
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if (list[i] + list[j] == sum && i != j)
//                    return new int[]{i, j};
//            }
//        }

        // solution 2
        if (list == null || list.length < 2 || sum < 2)
            return null;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            int value = sum - list[i];
            if (indexMap.get(value) != null)
                return new int[]{i, indexMap.get(value)};
            indexMap.put(list[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}