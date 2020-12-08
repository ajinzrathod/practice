@FunctionalInterface
interface Int1{
    public void fun1();
}

@FunctionalInterface
interface Int2{
    public void fun2();
}

class Demo implements Int1, Int2{
    public void fun1(){
        System.out.println("HEllo 1");
    }
    public void fun2(){
        System.out.println("Hello 2");
    }
}

class A{
    public static void main(String[] args){
        Demo d = new Demo();
        d.fun1();
        d.fun2();
    }
}
