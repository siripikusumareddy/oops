interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class InterfaceBank {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Current Balance: $" + acc.getBalance());
    }
}
