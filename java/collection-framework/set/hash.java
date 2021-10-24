import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class A{
    public static void main(String[] args){
        // <Integer> written like this is "generic"
        
        // Generics mean parameterized types. The idea is to allow type
        // (Integer, String, … etc, and user-defined types) to be a parameter
        // to methods, classes, and interfaces. Using Generics, it is possible
        // to create classes that work with different data types.  An entity
        // such as class, interface, or method that operates on a parameterized
        // type is called a generic entity.
        
        // Set<Integer> hs = new HashSet<>();

        // to maintain order of insertion
        // Set<Integer> hs = new LinkedHashSet<>();

        // to maintain sorted form of binary tree
        Set<Integer> hs = new TreeSet<>();

        hs.add(80);
        hs.add(20);
        hs.add(30);
        hs.add(70);
        hs.add(70);
        hs.add(70);
        hs.add(70);
        hs.add(70);

        System.out.println(hs);

        hs.remove(30);
        System.out.println(hs);

        hs.remove(30);
        System.out.println(hs);

        System.out.println(hs.contains(40));
        System.out.println(hs.contains(10));


        System.out.println(hs.isEmpty());
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs);


        hs.clear();
        System.out.println(hs);
    }
}
