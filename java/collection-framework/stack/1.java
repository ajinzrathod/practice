import java.util.Stack;


class A{
    public static void main(String[] args){
        Stack<Integer> plates = new Stack<>();

        plates.push(10);
        plates.push(20);
        plates.push(30);
        plates.push(40);
        System.out.println(plates);

        plates.pop();
        System.out.println(plates);

        plates.remove(1);
        plates.remove(1);
        System.out.println(plates);

        plates.push(30);
        plates.push(40);
        System.out.println(plates);
        System.out.println(plates.peek());
    }
}
