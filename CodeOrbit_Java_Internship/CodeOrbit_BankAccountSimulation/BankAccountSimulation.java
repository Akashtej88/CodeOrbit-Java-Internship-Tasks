import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Represents one bank account and its transactions.
class BankAccount {
    private final String accountHolder;
    private double balance;
    private final List<String> transactionHistory = new ArrayList<>();

    BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
        transactionHistory.add(String.format("Account opened with balance: %.2f", openingBalance));
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        transactionHistory.add(String.format("Deposited: +%.2f | Balance: %.2f", amount, balance));
        System.out.printf("Deposit successful. Current balance: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal cancelled.");
            transactionHistory.add(String.format("Failed withdrawal: %.2f (insufficient balance)", amount));
        } else {
            balance -= amount;
            transactionHistory.add(String.format("Withdrawn: -%.2f | Balance: %.2f", amount, balance));
            System.out.printf("Withdrawal successful. Current balance: %.2f%n", balance);
        }
    }

    public void showBalance() {
        System.out.printf("%s's current balance: %.2f%n", accountHolder, balance);
    }

    public void printTransactionHistory() {
        System.out.println("\\n========== TRANSACTION HISTORY ==========");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        System.out.println("==========================================");
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            name = "Account Holder";
        }

        double openingBalance;
        try {
            System.out.print("Enter opening balance (0 or more): ");
            openingBalance = Double.parseDouble(sc.nextLine().trim());
            if (openingBalance < 0) {
                System.out.println("Opening balance cannot be negative.");
                sc.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please run the program again.");
            sc.close();
            return;
        }

        BankAccount account = new BankAccount(name, openingBalance);
        boolean running = true;

        while (running) {
            System.out.println("\\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Show transaction history");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter deposit amount: ");
                        account.deposit(Double.parseDouble(sc.nextLine().trim()));
                        break;
                    case "2":
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(Double.parseDouble(sc.nextLine().trim()));
                        break;
                    case "3":
                        account.showBalance();
                        break;
                    case "4":
                        account.printTransactionHistory();
                        break;
                    case "5":
                        account.printTransactionHistory();
                        System.out.println("Thank you for using the bank simulation.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Select a number from 1 to 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a numeric value.");
            }
        }

        sc.close();
    }
}
