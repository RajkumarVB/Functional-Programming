import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComposableFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> removeLeading = String::stripLeading;
        UnaryOperator<String> removeEnding = String::stripTrailing;
        UnaryOperator<String> upperCase = String::toUpperCase;

        String processedString = removeLeading
                .andThen(removeEnding)
                .andThen(upperCase)
                .apply("   rajkumar     ");

        System.out.println(processedString);
    }
}