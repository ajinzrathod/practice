// All abstract, default, and static methods in an interface are implicitly
// public , so you can omit the public modifier. In addition, an interface can
// contain constant declarations. All constant values defined in an interface
// are implicitly public , static , and final . Once again, you can omit these
// modifiers.

// interface{
//     public = default;
//     private = must be decalred here;
//     protected = not allowed;
//     default = has special meaning in interface;
// }

interface A1{
    public void add();
    // private void add2();
    // protected void add3();
    default void add4(){
        System.out.println("");
    }

    static public void doSomething(){
        System.out.println("static");
    }

    // How can I define default access specifer in default method.
    // Writing default default void myDefaultMehod throws error: javac: repeated modifier (E)

    // you use interfaces to allow people from outside your code to interact with your code. 
    // To do this, you need to define your methods public.
    //


    default  void myDefaultMehod(){
        System.out.println("My default Method1");
    }
    // private void privateMethod(final String string) {
    private void privateMethod() {
        System.out.println("Hi");
    }
    }

interface A2{
    // default void myDefaultMehod(){
    //     System.out.println("My default Method2");
    // }
}

class B implements A1, A2{
    public void add(){
        System.out.println("");
    }
    // @Override
    // public void myDefaultMehod(){
    //     System.out.println("In child");
    // }
}

class C{
    public static void main(String[] args){
        A1.doSomething();

        B b = new B();
        b.myDefaultMehod();
    }
}
