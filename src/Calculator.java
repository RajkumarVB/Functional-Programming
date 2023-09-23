public class Calculator {
    public static int performOperation(IntOperation op, int inp1, int inp2){
        return op.operation(inp1,inp2);
    }
    public static void main(String[] args) {
        IntOperation addition = (a,b) -> a+b;
        IntOperation subtraction = (a,b) -> a-b;
        System.out.println(performOperation(addition,5,2));
        System.out.println(performOperation(subtraction,5,2));
    }
}

@FunctionalInterface
interface IntOperation{
    int operation(int a, int b);
}