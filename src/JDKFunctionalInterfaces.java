import java.util.function.*;

public class JDKFunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer,Integer> multiply = x -> x*2;
        System.out.println(multiply.apply(12));

        BiFunction<Integer,Integer, Integer> add = (x, y) -> x+y;
        System.out.println(add.apply(10,20));

        Consumer<String> greet = (name) -> System.out.println("Hello " + name + ", how are you doing?");
        greet.accept("Rajkumar");

        Supplier<Double> getRandomMax100= () -> Math.random() *100;
        System.out.println(getRandomMax100.get());

        Predicate<Integer> isOdd = (number) -> (number %2) != 0;
        System.out.println(isOdd.test(11));
    }
}
