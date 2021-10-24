import java.util.ArrayDeque;

class A{
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Insert
        System.out.println("\nInsert");
        ad.offer(400); // enters at last
        ad.offer(500); // enters at last
        ad.offerFirst(300); // ensters at first
        ad.offerFirst(200); // ensters at first
        ad.offerFirst(100); // ensters at first
        System.out.println(ad);


        // See
        System.out.println("\nPeek");
        System.out.println(ad.peek()); // sees first
        System.out.println(ad.peekFirst());// sees first
        System.out.println(ad.peekLast());// sees last

        // remove
        System.out.println("\nPoll");
        ad.poll(); // removes first
        System.out.println(ad);
        ad.pollFirst(); // removes first
        System.out.println(ad);
        ad.pollLast(); // removes last
        System.out.println(ad);

    }
}
