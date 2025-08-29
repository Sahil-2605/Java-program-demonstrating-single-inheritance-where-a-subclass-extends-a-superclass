class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    void displaySavingsInfo() {
        super.displayAccountInfo(); // Call superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankInheritanceDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("ACC123", 5000.0, 4.5);

        savings.displaySavingsInfo();  
        savings.deposit(1500);
        savings.withdraw(2000);
        savings.displaySavingsInfo();
    }
}
