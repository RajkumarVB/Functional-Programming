import java.util.function.Function;

public class ComposableFunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = num -> num *2;
        Function<Integer,Integer> increment = num -> num +1;

        Function<Integer, Integer> doubleItAndIncrement = doubleIt.andThen(increment);
        System.out.println(doubleItAndIncrement.apply(2));


    }
}
