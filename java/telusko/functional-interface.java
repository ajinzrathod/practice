@FunctionalInterface
interface A{
    int sum(int num1, int num2);
}
interface Abc{
    void show();
}

class B{
    public static void main(String[] args){
        // A a = new A(){
        //     public int sum(int num1, int num2){
        //         return num1 + num2;
        //     }
        // };
        
        A a = (int x, int y) -> x + y;
        Abc abc = () -> System.out.println("I m best");

        abc.show();
        int ans = a.sum(10, 10);

        System.out.println(ans);
    }
}
