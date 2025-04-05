import java.util.Scanner;
class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println(accountHolder + "'s Account Balance: $" + balance);
    }
}

interface InvestmentServices {
    void investInMutualFunds(double amount);
}

interface LoanServices {
    void applyForLoan(double amount);
}

class SavingsAccount extends BankAccount implements InvestmentServices {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account.");
    }

    public void investInMutualFunds(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for investment!");
        } else {
            balance -= amount;
            System.out.println(accountHolder + " invested $" + amount + " in Mutual Funds.");
        }
    }
}

class CurrentAccount extends BankAccount implements LoanServices {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Current Account.");
        }
    }

    public void applyForLoan(double amount) {
        System.out.println(accountHolder + " has applied for a loan of $" + amount);
    }
}

public class HybridBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        SavingsAccount savings = new SavingsAccount(name, balance);
        CurrentAccount current = new CurrentAccount(name, balance);

        System.out.println("\n--- Savings Account Operations ---");
        savings.deposit(500);
        savings.displayBalance();
        savings.investInMutualFunds(200);

        System.out.println("\n--- Current Account Operations ---");
        current.withdraw(300);
        current.displayBalance();
        current.applyForLoan(10000);
    }
}
