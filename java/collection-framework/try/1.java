import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;


class A{
    public static void main(String[] args){
        Iterable<Integer> i =  new ArrayList<>();
        i.add(10);
        System.out.println(i);

        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println(c);

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0, 5);
        l.add(20);
        l.add(30);
        System.out.println(l);

    }
}
