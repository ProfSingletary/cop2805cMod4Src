// HashCodeDemo.java

public class HashCodeDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Integer intObj = 5;
        Character cObj = 'a';
        String s = new String("test");
        String s1 = new String("test");
        String s2 = new String("tess");
        
        log("obj hashcode = " + obj.hashCode());
        log("intObj hashcode = " + intObj.hashCode());
        log("cObj hashcode = " + cObj.hashCode());
        log("s hashcode = " + s.hashCode());
        log("s1 hashcode = " + s1.hashCode());
        // implement String hashcode algorithm
        log("    manual calculation of s hashcode:");
        char[] a = s.toCharArray();
        int hcSum = 0;
        for (int i = 0; i < a.length; i++)
            hcSum += a[i] * (int)Math.pow(31, a.length - (i+1));
        log("    result is " + hcSum);        
        log("s2 hashcode = " + s2.hashCode());
    }
    
    public static void log(Object o) {
        System.out.println(o);
    }
}