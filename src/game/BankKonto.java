package game;

public class BankKonto {
    private int balance;

    public BankKonto() {
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




