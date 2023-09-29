import java.util.stream.Stream;

public class IntermediateOperations1 {
    public static void main(String[] args) {

        Stream.of("Apple","Mango","Banana", "Strawberry")
                .peek(fruit -> System.out.println("Peek : "+fruit))
                .filter(fruit -> fruit.length() <6)
                .forEach(System.out::println);
    }
}