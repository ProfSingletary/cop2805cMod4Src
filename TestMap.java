// TestMap.java
// demonstrates HashMap, LinkedHashMap, and TreeMap

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // Create a TreeMap from the preceding HashMap (sorts on keys)
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    
        // Create a LinkedHashMap (sort on access order)
        Map<String, Integer> linkedHashMap =new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        // Display the age for Lewis (affects access order)
        System.out.println("\nThe age for " + "Lewis is " +
        linkedHashMap.get("Lewis"));

        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);
    
        // Display each entry with name and age
        System.out.print("\nNames and ages are ");
        treeMap.forEach(  // returns a "BiConsumer"; performs specified operation"
                (name, age) -> System.out.print(name + ": " + age + " "));
    }
}