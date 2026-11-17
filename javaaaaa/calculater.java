import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = obj.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}
