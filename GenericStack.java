// GenericStack.java
// implements a stack using generics
// Liang Text / D. Singletary
// 6/26/2016

// Test Class
class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        log(stack1);
        log(stack1.pop());
        log(stack1.pop());
        log(stack1.pop());
        
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        log(stack2);
        log(stack2.pop());
        log(stack2.pop());
        log(stack2.pop());      
    }
    
    public static void log(Object o) {
        System.out.println(o);
    }
}

public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    // peek at the next item
    public E peek() {
        return list.get(getSize() - 1);
    }

    // push an item onto the stack
    public void push(E o) {
        list.add(o);
    }

    // pop an item from the stack
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return "stack: " + list.toString();
    }
}