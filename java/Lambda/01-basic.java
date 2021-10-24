@FunctionalInterface
interface FuncInterface{
    public void fun1();
}

@FunctionalInterface
interface Demo{
    public void demo();
}

@FunctionalInterface
interface Display{
    public String displayName();
}

@FunctionalInterface
interface AddNums{
    public double add(int a, int b);
}
class A{
    public static void main(String[] args){
        FuncInterface fobj = () ->{
            System.out.println("Hello");
        };
        fobj.fun1();

        Demo demo = () -> {
            System.out.println("Hello Demo");
        };
        demo.demo();

        Display disp = () -> {
            return "Anonymous";
        };
        System.out.println("Hello: " + disp.displayName());

        AddNums a1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Addition is: " + a1.add(10, 20));

    }
}
