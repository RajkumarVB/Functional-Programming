import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations1 {
    public static void main(String[] args) {

        Stream<String> processedStream = Stream.of("Apple", "Mango", "Banana", "Strawberry")
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Peek : " + fruit))
                .filter(fruit -> fruit.length() < 6);


    }
}