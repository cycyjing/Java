public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        // solution 1: bad Performance
//        int count = 0;
//        for (int i = 0; i < sortedArray.length; i++) {
//            if (sortedArray[i] < lessThan)
//                count++;
//        }
//        return count;

        // solution 2
        int begin = 0;
        int end = sortedArray.length - 1;
        return findMid(sortedArray, begin, end, lessThan);
    }

    private static int findMid(int[] sortedArray, int begin, int end, int lessThan) {
        int middle = begin + (end - begin) / 2;
        if (sortedArray[middle] == lessThan) {
            // If duplicates are present it returns the position of the first element
            while (middle - 1 > 0 && sortedArray[middle - 1] == lessThan)
                --middle;
            return middle;
        }
        if (middle <= begin) {
            // It happens if lessThan is not present in the array
            while (middle <= end && sortedArray[middle] < lessThan)
                ++middle;
            return middle;
        }
        if (sortedArray[middle] < lessThan) {
            begin = middle;  // ignore begin half
        } else {
            end = middle;  // ignore end half
        }
        return findMid(sortedArray, begin, end, lessThan);
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7}, 4));
    }
}