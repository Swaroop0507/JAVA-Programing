import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: Number of elements must be positive.");
                return;
            }

            int[] arr = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int min = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
            }

            if (min == 0) {
                System.out.println("Error: Minimum element is zero, division not possible.");
                return;
            }

            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            if (index < 0 || index >= n) {
                System.out.println("Error: Index out of bounds.");
                return;
            }

            System.out.println("Result of division: ");
            for (int num : arr) {
                System.out.println(num / min);
            }

            System.out.println("Accessing element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
