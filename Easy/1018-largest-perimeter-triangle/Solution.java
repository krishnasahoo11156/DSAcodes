import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int largestPerimeter(int[] nums) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            pq.offer(num);
        }

        while (pq.size() >= 3) {

            int a = pq.poll();
            int b = pq.poll();
            int c = pq.poll();

            if (b + c > a) {
                return a + b + c;
            }

            pq.offer(b);
            pq.offer(c);
        }

        return 0;
    }
}