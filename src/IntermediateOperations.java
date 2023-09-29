import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenStream = integerStream.filter(num -> num % 2 == 0);
        Stream<Integer> first4Even = evenStream.limit(4);
        first4Even.forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(num -> num %2 ==0)
                .limit(2)
                .forEach(System.out::println);

        Stream.of("Apple","Mango","Banana", "Strawberry")
                .limit(2)
                .map(str -> {
                    System.out.println(str);
                    return 1;
                })
                .forEach(System.out::println);
    }
}