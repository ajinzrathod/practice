import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;


class A{
    public static void main(String[] args){
        // Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // using minheap
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        pq.peek();
        System.out.println(pq);
    }
}
