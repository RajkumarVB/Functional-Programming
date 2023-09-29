import java.util.stream.Stream;

public class IntermediateOperations1 {
    public static void main(String[] args) {

        Stream<String> processedStream = Stream.of("Apple", "Mango", "Banana", "Strawberry")
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Peek : " + fruit))
                .filter(fruit -> fruit.length() < 6);

        Stream.of(1,2,9,8,3,6,4,3,4,5,1,2,2,9)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Stream<Integer> oddStream = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> evenStream = Stream.of(2,4,6,8,10);

        Stream.concat(oddStream,evenStream)
                .forEach(System.out::println);
    }
}