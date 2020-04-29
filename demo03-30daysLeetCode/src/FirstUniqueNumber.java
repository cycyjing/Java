import java.util.*;

public class FirstUniqueNumber {
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    // Initializes the object with the numbers in the queue.
    public FirstUniqueNumber(int[] nums) {
        for (int n : nums) {
            queue.offer(n);
            if (deque.contains(n))
                deque.remove(n);
            else
                deque.offerLast(n);
        }
    }

    // returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
    public int showFirstUnique() {
        if (!deque.isEmpty())
            return deque.getFirst();
        return -1;
    }

    // insert value to the queue.
    public void add(int value) {
        queue.offer(value);
        if (deque.contains(value))
            deque.remove(value);
        else
            deque.offerLast(value);
    }
}
