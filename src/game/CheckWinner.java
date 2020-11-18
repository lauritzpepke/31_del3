package game;

public class CheckWinner {

    public boolean hasLost(BankAccount ba)
    {
        int balance=ba.getBalance();
        if (balance<0)
            return true;
        else
            return false;
    }
}
