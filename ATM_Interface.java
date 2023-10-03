import java.util.*;

interface ATM {
    void checkBalance();
    void deposit();
    void withdraw();
}

class BasicATM implements ATM {
    private double balance;

    public BasicATM(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your account balance is: $" + balance);
    }

    @Override
    public void deposit() {
    	@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    @Override
    public void withdraw() {
    	@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount. Withdrawal failed.");
        }
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial balance: $");
        double initialBalance = scanner.nextDouble();

        ATM atm = new BasicATM(initialBalance);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
