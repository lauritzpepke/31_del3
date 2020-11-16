package game;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void changeBalance(int change) {
        this.balance += change;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

}




