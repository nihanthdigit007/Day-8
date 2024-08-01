public class Assignment75 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected exception occurred.");
        }
    }
}
