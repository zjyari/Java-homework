import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an expression using only parentheses: ");
        String expression = scanner.next();

        boolean isBalanced = BalancedParentheses.checkBalancedParentheses(expression);
        if (isBalanced) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced");
        }

        scanner.close();
    }
}