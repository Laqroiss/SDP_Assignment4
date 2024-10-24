package interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        String expression = "5 + 2 - 3";
        Expression parsedExpression = interpreter.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret());
    }
}
