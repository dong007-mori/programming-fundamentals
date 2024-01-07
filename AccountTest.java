package L2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Display the balance in the account.
        System.out.printf(
                "%s balance: $%.2f%n",
                account1.getName(), account1.getBalance()
        );
        System.out.printf(
                "%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance()
        );
\.
        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf(
                "%nadding %.2f to account1 balance%n%n",
                depositAmount
        );
        account1.deposit(depositAmount);

        // Display balances.
        System.out.printf(
                "%s balance: $%.2f%n",
                account1.getName(), account1.getBalance()
        );
        System.out.printf(
                "%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance()
        );

        // Prompt the user to input an amount to deposit for account 2.
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf(
                "%nadding %.2f to account2 balance%n%n",
                depositAmount
        );
        account2.deposit(depositAmount);

        // display balances
        System.out.printf(
                "%s balance: $%.2f%n",
                account1.getName(), account1.getBalance()
        );
        System.out.printf(
                "%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance()
        );
    }
}