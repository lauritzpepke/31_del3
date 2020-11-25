package game;

/**
 * Klasse der tjekker om nogen har tabt spillet
 */
public class CheckTaber {

    /**
     *
     * @param ba En spillers bankkonto
     * @return om spilleren har tabt eller om spillet skal fortsætte
     */
    public boolean hasLost(BankKonto ba)
    {
        int balance=ba.getBalance();
        if (balance<0)
            return true;
        else
            return false;
    }
}
