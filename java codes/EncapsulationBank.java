class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNumber, double initialBalance) {
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}
