import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    /*
     * 1 <= stones.length <= 30
     * 1 <= stones[i] <= 1000
     * */
    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length < 1 || stones.length > 30)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            int diff = x - y;
            if (diff > 0) {
                pq.add(diff);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
