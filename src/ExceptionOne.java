import java.util.Scanner;

public class ExceptionOne {
    public static int getDivision(int a, int b){
        int result = 0;
        try{
            result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int a = input.nextInt();
        System.out.println("Enter a denominator: ");
        int b = input.nextInt();

        System.out.println(getDivision(a,b));
        System.out.println("Program finished");
        input.close();
    }
}
