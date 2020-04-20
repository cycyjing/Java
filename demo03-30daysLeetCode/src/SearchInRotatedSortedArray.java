public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // solution 1
//        if (nums == null || nums.length == 0)
//            return -1;
//
//        for (int i = 0; i < nums.length; i++)
//            if (nums[i] == target)
//                return i;
//
//        return -1;

        // solution 2
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
