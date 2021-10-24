// Below line is written to accidentaly avoid writing 2 abstact methods
@FunctionalInterface
interface FuncInterface{
    public void abstractFun();
}

class B implements FuncInterface{
    public void abstractFun(){
        System.out.println("HEllo");
    }
}

class A{
    public static void main(String[] args){
        B b = new B();
        b.abstractFun();
    }
}
