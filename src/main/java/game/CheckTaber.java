package game;

/**
 * Klasse der tjekker om nogen har tabt spillet
 */
public class CheckTaber {
    private boolean taber;
    private int taberGrænse = 0;

    public void setCheckTaber(boolean taber) {
        this.taber = taber;
    }

    public boolean isCheckTaber() {
        return taber;
    }
    

    public void harTabt(int balance) {
        if(taberGrænse>balance)
            setCheckTaber(true);
        else
            setCheckTaber(false);
    }
}
