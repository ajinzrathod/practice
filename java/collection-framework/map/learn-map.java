import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class A{
    public static void main(String[] args){
        // Map<Integer, String> hm = new HashMap<>();
        Map<Integer, String> hm = new TreeMap<>();

        hm.put(2, "Two");
        hm.put(1, "One");
        hm.put(4, "Four");
        hm.put(3, "Three");
        System.out.println(hm);


        // if you dont wnat to override

        if(!hm.containsKey(2)){
            hm.put(4, "New Four");
        }
        System.out.println(hm);

        //OR
        hm.putIfAbsent(2, "New two");
        System.out.println(hm);
        hm.putIfAbsent(5, "Five");
        System.out.println(hm);

        // Overrides
        hm.put(4, "New Four");
        System.out.println(hm);

        System.out.println();
        // Iterate
        for(Map.Entry<Integer, String> element: hm.entrySet()){
            System.out.println(element);
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        // Iterate only keys
        System.out.println(hm.keySet());
        for(Integer key: hm.keySet()){
            System.out.println(key);
        }

        // Iterate only values
        System.out.println(hm.values());
        for(String value: hm.values()){
            System.out.println(value);
        }

        System.out.println();
        // check if value exists
        System.out.println("Three is there? " + hm.containsValue("Three"));
        hm.remove(3);
        System.out.println("Three is there? " + hm.containsValue("Three"));


        System.out.println();
        // Check if empty
        System.out.println(hm.isEmpty());

        hm.clear();
        System.out.println(hm);

        System.out.println(hm.isEmpty());

    }
}
