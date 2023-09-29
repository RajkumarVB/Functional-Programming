import java.util.function.Function;
public class Closures {
    public static void main(String[] args) {
        Function<Integer, Integer> counter = Closures.counter();
        System.out.println(counter.apply(1));
    }
    private static Function<Integer,Integer> counter() {
        int count =0;
        Function<Integer,Integer> increment = x -> count+1;
//        count ++; // This will not work!
        return increment;
    }
}