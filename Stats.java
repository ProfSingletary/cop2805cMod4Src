//public class Stats<T> { // causes build error
public class Stats<T extends Number> {
    private T[] nums;  // array of type T

    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        //Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Double dnums[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        Stats<Integer> iob = new Stats<Integer>(inums);
        Stats<Double> dob = new Stats<Double>(dnums);

        System.out.println("Integer average = " + iob.average());
        System.out.println("Double average = " + dob.average());
                
        if (iob.sameAvg(dob))
             System.out.println("Averages are the same.");
        else
             System.out.println("Averages are different");
    }
    
    Stats(T[] o) {   // constructor
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
        
    // this header causes build error
    //   boolean sameAvg(Stats<T> ob) {
    // this one works
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}