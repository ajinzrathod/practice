class Parent {
    String name;

    Parent() {
        System.out.println("Parent - assigning");
        name = "Ajin";
        System.out.println("Parent - assigned");
    }

    // Parent(String n) {
    //     System.out.println("Parent - assigning 2 ");
    //     name = n;
    //     System.out.println("Parent - assigned 2 ");
    // }

    // public void parentFunction() { // 1
    private void parentFunction() { // 1
        System.out.println("I am from parent 1");
    }

    public void function() { // 2
        System.out.println("I am from parent 2");
    }
}

class Child extends Parent {
    int age;

    Child() {
        age = 30;
        // super();
        // name = "Child Ajin";
    }

    @Override
    public void function() { // 2
        System.out.println("I am from child 2");
        System.out.println("In child function" + name);
        System.out.println("In child function" + name);
        System.out.println(super.name);
        System.out.println();
    }
}

class GrandChild extends Child{
    // public void 

}

class Demo {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.name);
        System.out.println(c.age);
        c.parentFunction();
        c.function();

        Parent p = new Child();
        System.out.println(p.name);
        System.out.println(p.name);
        p.parentFunction();
        p.function();
        // System.out.println(p.age);

        GrandChild gc = new GrandChild();
        System.out.println(gc.age);
        System.out.println(gc.name);
    }
}
