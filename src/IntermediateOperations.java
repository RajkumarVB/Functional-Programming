import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> limitedStream = numbers.limit(5);
        limitedStream.forEach(System.out::println);

    }
}
