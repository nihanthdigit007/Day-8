import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Assignment74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        try {
            checkNumber(inputNumber);
            System.out.println("The number is positive.");
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }
}
