import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }
}
