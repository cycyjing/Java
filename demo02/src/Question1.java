import java.util.*;
import java.lang.*;
import java.io.*;

public class Question1 {
    static List<String> doThreeFive(int max) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 != 0) {
                    list.add(i - 1, "three");
                } else if (i % 5 == 0 && i % 3 != 0) {
                    list.add(i - 1, "five");
                } else {//if (i % 3 == 0 && i % 5 == 0)
                    list.add(i - 1, "threefive");
                }
            } else {
                list.add(i - 1, i + "");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // should print "1","2","three","4","five","three","7","8","three","five","11","three","13","14","threefive","16"
        System.out.println(Question1.doThreeFive(16).size());
        System.out.println(String.join(",", Question1.doThreeFive(16).toString()));
    }
}
