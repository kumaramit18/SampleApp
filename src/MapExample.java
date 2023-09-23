package src;

import java.util.HashMap;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "Amit");
        map.put(200, "Deepak");
        map.put(400, "Sambhavi");
        map.put(300, "Geeta");

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        System.out.println("Before Sorting: ");

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("After Sorting: ");

        map.entrySet()

                .stream()

                .sorted(Map.Entry.comparingByKey())

                .forEach(System.out::println);


        System.out.println("Before Sorting: ");

        Set set2 = map.entrySet();
        itr = set2.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }


        Map<Integer, String> treemap = new TreeMap<Integer, String> (map);
        Set set3 = treemap.entrySet();
        itr = set3.iterator();
        System.out.println("TreeMap: ");

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }



}

