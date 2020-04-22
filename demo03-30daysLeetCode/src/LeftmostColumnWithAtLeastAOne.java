import java.util.List;

public class LeftmostColumnWithAtLeastAOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> list = binaryMatrix.dimensions();
        if (list == null || list.size() <= 0)
            return -1;

//        for (int i = 0; i < list.get(1); i++) { // column
//            for (int j = 0; j < list.get(0); j++) { // row
//                if (binaryMatrix.get(j, i) == 1)
//                    return i;
//            }
//        }
//        return -1;

//        int index = Integer.MAX_VALUE;
//        for (int i = 0; i < list.get(0); i++) {
//            for (int j = 0; j < list.get(1); j++) {
//                if (binaryMatrix.get(i, j) == 1) {
//                    index = Math.min(j, index);
//                    continue;
//                }
//
//            }
//        }
//        return index != Integer.MAX_VALUE ? index : -1;

        int output = -1;
        int i = 0;
        int j = list.get(1) - 1;
        while (i < list.get(0) && j >= 0) {
            if (binaryMatrix.get(i, j) == 0)
                i++;
            else {
                output = j;
                j--;
            }
        }

        return output;
    }
}

interface BinaryMatrix {
    public int get(int x, int y);

    public List<Integer> dimensions();
};