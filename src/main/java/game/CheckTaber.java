package game;

public class CheckTaber {

    public boolean hasLost(BankKonto ba)
    {
        int balance=ba.getBalance();
        if (balance<0)
            return true;
        else
            return false;
    }
}
