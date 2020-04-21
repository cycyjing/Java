import java.util.ArrayList;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // solution 1
//        ArrayList<Integer> zeros = new ArrayList<>();
//        ArrayList<Integer> nons = new ArrayList<>();
//        for (int i : nums) {
//            if (i != 0)
//                nons.add(i);
//            else
//                zeros.add(i);
//        }
//        nons.addAll(zeros);
//        for (int i = 0; i < nons.size(); i++)
//            nums[i] = nons.get(i);

        // solution 2
        int nonZero = 0;
        for (int i : nums) {
            if (i != 0)
                nums[nonZero++] = i;
        }
        for (int i = nonZero; i < nums.length; i++)
            nums[i] = 0;
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
