public class JumpGame {
    public boolean canJump(int[] nums) {
        // solution?
//        if (nums.length <= 0)
//            return false;
//
//        int index = 0;
//        while (index < nums.length - 1) {
//            index += nums[index];
//            if (index > nums.length - 1)
//                return true;
//            if (nums[index] == 0 && index >= nums.length)
//                return false;
//        }
//        return index == nums.length - 1 ? true : false;

        // solution 1
//        return canJump(0, nums);

        // solution 2: right to left
        int lastPosition = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPosition) {
                lastPosition = i;
            }
        }
        return lastPosition == 0;
    }

    public boolean canJump(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int maxJump = Math.min(position + nums[position], nums.length - 1);
//        for (int next = position + 1; next <= maxJump; next++) {
        for (int next = maxJump; next > position; next--) {
            if (canJump(next, nums)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        jumpGame.canJump(new int[]{2, 3, 1, 1, 4});
    }
}
