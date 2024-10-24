package interpreter;

public class Interpreter {
    public Expression parse(String input) {
        String[] tokens = input.split(" ");
        Expression left = new NumberExpression(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            Expression right = new NumberExpression(Integer.parseInt(tokens[i + 1]));
            left = new OperationExpression(left, right, operator);
        }

        return left;
    }
}
