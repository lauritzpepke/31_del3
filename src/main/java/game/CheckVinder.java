package game;

public class CheckVinder {

    public boolean hasLost(BankKonto ba)
    {
        int balance=ba.getBalance();
        if (balance<0)
            return true;
        else
            return false;
    }
}
