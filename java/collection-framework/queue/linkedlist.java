import java.util.LinkedList;
import java.util.Queue;

class A {
    public static void main(String[] args){
        Queue<Integer> ll = new LinkedList<>();

        // inserts in queue
        ll.offer(10); // add() // throws exception too
        // offer returns null in error
        ll.offer(20);
        ll.offer(30);
        ll.offer(40);
        ll.offer(50);
        System.out.println(ll);

        // removes first in queue
        ll.poll(); // remove() // throws exception too
        System.out.println(ll);
        // poll returns null in error

        System.out.println(ll.peek()); // element() // throws exception too
        // peek returns null in error
    }
}
