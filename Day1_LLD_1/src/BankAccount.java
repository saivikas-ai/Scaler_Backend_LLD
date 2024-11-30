public class BankAccount {
    double balance;
    String ownerName;

    void deposit(double amount){
        if(amount < 0) return;
        balance += amount;
    }
    // TODO Add Print Methods to print balance.
    void withdraw(double amount){
        if(amount > balance && amount > 0) return;
        balance -= amount;
    }
}
