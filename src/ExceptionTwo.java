
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTwo {

    public int getElement(int index) {
        int[] numbers = {10, 20, 30, 40, 50};
        return numbers[index];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ExceptionTwo exceptionTwo = new ExceptionTwo();

        try {
            System.out.print("Enter the index of a number in the array: ");

            int index = input.nextInt();

            int result = exceptionTwo.getElement(index);

            System.out.println("Value: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid array index.");

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter a whole number.");

        } finally {

            System.out.println("Program finished.");
            input.close();
        }
    }
}
