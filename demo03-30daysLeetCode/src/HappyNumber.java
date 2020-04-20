import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
//        Integer.toString(n);
        HashSet<Integer> set = new HashSet<>();
        String[] arrStr = String.valueOf(n).split("");
        while (n != 1) {
            int sum = 0;
            for (String i : arrStr) {
                sum += (int) Math.pow(Integer.valueOf(i), 2);
            }
            n = sum;
            if (set.contains(sum)) break;
            set.add(sum);
            arrStr = String.valueOf(sum).split("");
        }

        return n == 1;
    }
}
