public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // solution 1
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tep = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    tep *= nums[j];
                }
            }
            output[i] = tep;
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
