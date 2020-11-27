package game;

/**
 * Klasse for spillernes pengebeholdning
 */
public class BankKonto {
    private int balance;

    public BankKonto(int balance) {
        this.balance = 0;
    }

    /**
     * Metode for at ændre en spillers balance
     * @param change Ændring i balancen
     */
    public void changeBalance(int change) {
        this.balance += change;
    }

    /**
     * Metode for at set balancen
     * @param balance En spillers pengebeholdning
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Metode for at få værdien af balancen
     * @return den aktuelle balance
     */
    public int getBalance() {
        return this.balance;
    }

}




