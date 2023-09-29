import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations1 {
    public static void main(String[] args) {

        List<String> processedList = Stream.of("Apple", "Mango", "Banana", "Strawberry")
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Peek : " + fruit))
                .toList();

    }
}