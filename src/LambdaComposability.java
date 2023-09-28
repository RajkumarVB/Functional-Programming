import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaComposability{
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x+1;
        Consumer<String> logMessage = message -> System.out.println(message + ":"+ LocalDateTime.now());
        Runnable logStart = () -> logMessage.accept("Start");
        Runnable logEnd = () -> logMessage.accept("End");
        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation,input) -> {
            logStart.run();
            System.out.println(operation.apply(5));
            logEnd.run();
        };
        logger.accept(increment,10);
    }
}