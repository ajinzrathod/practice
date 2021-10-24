class Parent {
    String name;
    Parent(){
        name = "Ajin";
        System.out.println("Hi");
    }
    public void parentFunction(){ // 1
        System.out.println("I am from parent 1");
    }
    public void function(){ // 2
        System.out.println("I am from parent 2");
    }
}


class Child extends Parent{
    // String name;
    int age;
    Child(){
        name = "Child Ajin";
        age = 30;
    }

    @Override
    public void function(){ // 2
        System.out.println("I am from child 2");
        System.out.println(name);
        System.out.println("Super: " + super.name);
        super.function();
    }
}

class Demo {    
    public static void main (String [] args) {
        Child c = new Child();
        System.out.println(c.name);
        System.out.println(c.age);

        c.function();
        c.parentFunction();

        System.out.println("");
        Parent p = new Child();
        System.out.println(p.name);
        p.function();
        p.parentFunction();
        // System.out.println(p.age);
    }
}
