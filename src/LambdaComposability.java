import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaComposability{
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x+1;
        Runnable logStart = () -> System.out.println("Start : " + LocalDateTime.now());
        Runnable logEnd = () -> System.out.println("End : " + LocalDateTime.now());
        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation,input) -> {
            logStart.run();
            System.out.println(operation.apply(5));
            logEnd.run();
        };
        logger.accept(increment,10);
    }
}