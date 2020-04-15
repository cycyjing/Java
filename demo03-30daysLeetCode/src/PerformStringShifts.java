import java.util.ArrayDeque;
import java.util.Deque;

public class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        int length = s.length();
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                s = s.substring(shift[i][1]) + s.substring(0, shift[i][1]);
            } else {
                System.out.println(length - shift[i][1]);
                s = s.substring(length - shift[i][1]) + s.substring(0, length - shift[i][1]);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        PerformStringShifts pss = new PerformStringShifts();
        String s = pss.stringShift("abc", new int[][]{{0, 1}, {1, 2}});
        System.out.println(s);
    }
}
