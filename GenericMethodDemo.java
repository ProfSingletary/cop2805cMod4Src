// GenericMethodDemo.java
// Demonstrates generic methods

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 4, 5 };
        String[] strings = { "London", "Paris", "New York", "Austin" };
        
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
                
        GenericMethodDemo.print(integers);
        GenericMethodDemo.print(strings);
                
        GenericMethodDemo gmd = new GenericMethodDemo();
        gmd.<Integer>print2(integers);
        gmd.<String>print2(strings);
                
        gmd.print2(integers);
        gmd.print2(strings);
    }
    
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
        
    public <E> void print2(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}