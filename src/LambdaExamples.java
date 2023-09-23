public class LambdaExamples {
    public static void main(String[] args) {
        MathOperation increment = x -> x + 1;
        System.out.println(increment.operation(20));
        AnotherOperation decrement = x -> x-1;
        System.out.println(decrement.operation(20));
//        decrement = increment; // You can't do this, unless both of same type
        System.out.println(decrement.operation(20));
    }
}

@FunctionalInterface
interface MathOperation{
    int operation(int x);
}

@FunctionalInterface
interface AnotherOperation{
    int operation(int x);
}