class B{
    static int n=90;
    int x;
    B(){
        x = 50;
    }
    public void aj(){
        n++;
    }
    // public void a2(){
    public static void a2(){
        System.out.println("Hello");
        // System.out.println(x);
    }
}

class A{
    int i = 10;
    static int j = 10;
    public static void main(String[] args){
        System.out.println(j);

        B b1 = new B();
        B b2 = new B();

        // call by className warning
        System.out.println(b1.n);
        b1.aj();
        System.out.println(b1.n);

        System.out.println(b2.n);

        b2.a2();
    }
}
