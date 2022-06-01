// AGenericClass.jva
// Sample generic class

public class AGenericClass<E> {
    private String name; // name for identification purposes
    private  E e; // generic property
    
    public  AGenericClass(String name) {
        this.name = name;
    }
    
    // mutator to set our generic property
    public void setE(E e) {
        // print e so we know what we're getting
        System.out.println("setting e to " + e);
        this.e = e;
    }
    
    public String toString() { return name; }
    
    public static void main(String[] args) {
        // create an String-based version of our generic class
        AGenericClass<String> strObj = new AGenericClass<>("String Object");
        System.out.println(strObj);
        strObj.setE("Hello World");
        
        // create an Integer-based version of our generic class
        AGenericClass<Integer> intObj = new AGenericClass<>("Integer Object");
        System.out.println(intObj);
        intObj.setE(20);
    }
}