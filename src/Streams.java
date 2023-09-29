import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {

        //Using stream API
        List<String> names = List.of("Foo", "Bar","Baz");
//        Set<String> names = Set.of("Foo", "Bar","Baz");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        //Using an Array
        int[] numbers = {1,2,3,4,5};
        Arrays.stream(numbers).forEach(System.out::println);

        // Using stream of
        Stream.of("Mango","Banana", "Strawberry").forEach(System.out::println);

        //Using built-in APIs that return Stream
        Stream<String> lines = Files.lines(Path.of("sample.txt"));
        lines.forEach(System.out::println);

        // Using Stream.iterate
        Stream.iterate(0,x->x+2)
                .limit(10)
                .forEach(System.out::println);

        List<Integer> upToHundred = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .toList();
        System.out.println(upToHundred);
    }
}
