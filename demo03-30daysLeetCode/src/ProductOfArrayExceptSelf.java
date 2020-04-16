public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // solution 1
//        int[] output = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int tep = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i) {
//                    tep *= nums[j];
//                }
//            }
//            output[i] = tep;
//        }
//        return output;

        // solution 2
//        int n = nums.length;
//        int[] output = new int[n];
//        int[] forward = new int[n];
//        int[] backward = new int[n];
//        forward[0] = 1;
//        backward[n - 1] = 1;
//        for (int i = 1; i < n; i++) {
//            forward[i] = forward[i - 1] * nums[i - 1];
//        }
//        for (int i = n - 2; i >= 0; i--) {
//            backward[i] = backward[i + 1] * nums[i + 1];
//        }
//        for (int i = 0; i < n; i++) {
//            output[i] = forward[i] * backward[i];
//        }
//        return output;

        // solution 3
        int n = nums.length;
        int[] output = new int[n];
        output[0] = 1;
        int backward = 1;
        // forward
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        // backward
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= backward;
            backward *= nums[i];
        }
        return output;
    }


    public static void main(String[] args) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] output = p.productExceptSelf(new int[]{1, 2, 3, 4});

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
