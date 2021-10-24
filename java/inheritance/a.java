// amitabh
class GrandParent{
    String home_name;
    String wife_name;

    GrandParent(){
        home_name = "Prateeksha";
        wife_name = "Jaya Bachan";
    }
}

// abhishek
class Parent extends GrandParent{
    String wife_name;
    String mobile_no;
    Parent(){
        wife_name = "Ashwariya"; 
        mobile_no = "1234567890";
    }
    public void sayAboutAmitabh(){
        System.out.println(super.home_name);
        System.out.println(super.wife_name); // why is this giving ashwariyaa
    }
}

// Aradhaya
class Child extends Parent{
    String wife_name;
    String adhar_card_no;
    Child(){
        wife_name = "--no-wife--";
        adhar_card_no = "1234 5689 9876 5432";
    }
    public void sayAboutAmitabh(){
        // Not allowed
        // System.out.println(super.super.home_name);
        // System.out.println(super.super.wife_name);
    }
    public void sayAboutAbhishek(){
        System.out.println(super.home_name);
        System.out.println(super.wife_name); 
    }
}

class BachanFamily{
    public static void main(String[] args){
        // Ask amitabh bachapn about amitabh bachan
        GrandParent gp1 = new GrandParent();
        System.out.println("Ask amitabh bachapn about amitabh bachan");
        System.out.println(gp1.home_name);
        System.out.println(gp1.wife_name);
        System.out.println();

        // Ask amitabh bachapn about abhishek bachan
        GrandParent gp2 = new Parent();
        System.out.println("Ask amitabh bachapn about abhishek bachan");
        System.out.println(gp2.wife_name);
        // System.out.println(gp2.mobile_no); // AMitabh bolega.. yeh phone no kya hota hai
        System.out.println();

        // Ask amitabh bachapn about aradhaya bachan
        GrandParent gp3 = new Child();
        System.out.println("Ask amitabh bachapn about aradhaya");
        System.out.println(gp3.wife_name);
        // System.out.println(gp3.adhar_card_no); // AMitabh bolega.. yeh adhar_card_no kya hota hai
        System.out.println();

        System.out.println("----------");
        System.out.println("----------");

        // // Ask abhishek bachapn about amitabh bachan
        // Parent p1 = new GrandParent(); 
        // System.out.println("Ask abhishek bachapn about amitabh bachan");
        // System.out.println(p1.home_name);
        // System.out.println(p1.wife_name);
        // System.out.println();

        // Ask abhishek bachapn about abhishek bachan
        Parent p2 = new Parent();
        System.out.println("Ask abhishek bachapn about amitabh bachan");
        p2.sayAboutAmitabh();
        // System.out.println(p1.home_name);
        // System.out.println(p1.wife_name);
        // System.out.println();
        
        System.out.println("Ask abhishek bachapn about abhishek bachan");
        System.out.println(p2.home_name);
        System.out.println(p2.wife_name);
        System.out.println(p2.mobile_no);
        System.out.println();

        // Ask abhishek bachapn about aradhaya bachan
        Parent p3 = new Child();
        System.out.println("Ask abhishek bachapn about aradhaya");
        System.out.println(gp3.wife_name);
        // System.out.println(gp3.adhar_card_no); // abhishek bolega.. yeh adhar_card_no kya hota hai
        System.out.println();


        Child c1 = new Child();
        System.out.println(c1.wife_name);
        System.out.println(c1.adhar_card_no);

        c1.sayAboutAmitabh();
        c1.sayAboutAbhishek();
        
    }
}
