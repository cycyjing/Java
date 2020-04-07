import java.util.*;
import java.lang.*;
import java.io.*;

public class Question1 {
    static List<String> doThreeFive(int max) {
        int number = 1;
        List<String> list = new ArrayList<>();
        while (number < max) {
            if (number % 3 == 0 || number % 5 == 0) {
                if (number % 3 == 0 && number % 5 == 0) {
                    list.set(number - 1, "threefive");
                }
                if (number % 3 == 0) {
                    list.set(number - 1, "three");
                }
                if (number % 5 == 0) {
                    list.set(number - 1, "five");
                }
            } else {
                list.set(number - 1, number + "");
            }
            number++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Question1.doThreeFive(16).toString());
    }
}
