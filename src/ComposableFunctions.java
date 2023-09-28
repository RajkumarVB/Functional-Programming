import java.util.function.Function;

public class ComposableFunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = num -> num *2;
        Function<Integer,Integer> increment = num -> num +1;

        int result = doubleIt.andThen(increment).apply(2);
        System.out.println(result);
    }
}
