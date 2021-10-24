import java.util.HashSet;
import java.util.Set;
import p1.Student;


class A{
    public static void main(String[] args){
        Set<Student> s = new HashSet<>();

        s.add(new Student(1, "Ajinkya"));
        s.add(new Student(2, "setffi"));
        s.add(new Student(3, "Ghanshyam"));
        s.add(new Student(1, "AjinkyaAgain"));

        System.out.println(s);


        // not hashset
        Student s1 = new Student(1, "Test1");
        Student s2 = new Student(1, "Test2");
        System.out.println(s1);
        System.out.println(s2);

        // coz roll no is same. see equals function in Student.java
        System.out.println(s1.equals(s2));
    }
}
