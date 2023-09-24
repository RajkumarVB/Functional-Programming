import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
//        Supplier<Double> getRandom = () -> Math.random();
        Supplier<Double> getRandom = Math::random;

//        Function<Person,Integer> getAge = (person) -> person.getAge();
        Function<Person,Integer> getAge = Person::getAge;

        Person p1 = new Person("ABC",12);
        Person p2 = new Person("XYZ",8);

//        BiPredicate<Person,Person> isSamePerson = (person1, person2) -> person1.equals(person2);
        BiPredicate<Person,Person> isSamePerson = Person::equals;


//        Function<List<String>, Integer> getSize = (list) -> list.size();
        Function<List<String>, Integer> getSize = List::size;

//        Function<List<String>, Collection<String>> dedupe = (list) -> new HashSet<>(list);
        Function<List<String>, Collection<String>> dedupe = HashSet::new;

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}