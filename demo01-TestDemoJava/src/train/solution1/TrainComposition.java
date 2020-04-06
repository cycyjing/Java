package train.solution1;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
    private Deque<Integer> deque = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {
        deque.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        deque.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        Integer wagon = deque.pollFirst();
        return wagon == null ? 0 : wagon;
    }

    public int detachWagonFromRight() {
        Integer wagon = deque.pollLast();
        return wagon == null ? 0 : wagon;
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}