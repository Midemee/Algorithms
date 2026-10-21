
import java.util.Scanner;

public class BankAccount {

    double balance = 5000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();

            bankAccount.withdrawal(amount);

            System.out.printf(
                    "Remaining Balance: %.2f%n",
                    bankAccount.balance
            );

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Transaction attempt completed.");
            input.close();
        }
    }

    public void withdrawal(double amount) {

        if (amount <= 0) {
            throw new ArithmeticException(
                    "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Amount exceeds the balance."
            );
        }

        balance -= amount;
    }
}
