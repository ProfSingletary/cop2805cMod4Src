// ListDemo.java
// Demonstrates ArrayList and LinkedList

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to Integer
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        
        log("List of integers in the ArrayList: ");
        log(arrayList);
        log("");
        
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        
        log("Linked list contents moving forward: ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            log(listIterator.next() + " ");
        }
        log("");
        
        log("Linked list contents moving backward: ");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            log(listIterator.previous() + " ");
        }
    }
        
    public static void log(Object o) {
        System.out.println(o);
    }
}