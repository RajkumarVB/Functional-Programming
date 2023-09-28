import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaComposability{
    public static void operationLogger(UnaryOperator<Integer> operator,int value){
        System.out.println("Start : " + LocalDateTime.now());
        System.out.println(operator.apply(value));
        System.out.println("End : " + LocalDateTime.now());
    }
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x+1;

        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation,input) -> {
            System.out.println("Start : " + LocalDateTime.now());
            System.out.println(operation.apply(5));
            System.out.println("End : " + LocalDateTime.now());
        };
        operationLogger(increment,5);
        logger.accept(increment,10);
    }
}