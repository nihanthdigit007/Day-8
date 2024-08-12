import java.util.Scanner;

public class Assignment71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        try {
            int result = 100 / inputNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. ");
        }
        scanner.close();
    }
}
