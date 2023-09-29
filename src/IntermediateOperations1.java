import java.util.List;
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

        List<Student> students = List.of(
                new Student(1,"Raj"),
                new Student(2,"Foo"),
                new Student(3,"Ma")
        );

        List<String> studentList = students.stream()
                .filter(student -> student.getId() < 3)
                .map(Student::getName)
                .toList();

        studentList.forEach(System.out::println);
    }
}

class Student{
    private int id;
    private String name ;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}