// GenericDemo1.java
// demonstrate use of a generic

import java.util.Date;

public class GenericDemo1 {
    public static void main(String[] args) {
        //Comparable c = new Date();
        Comparable<Date> c = new Date();
        System.out.println(c.compareTo("red"));
    }
}