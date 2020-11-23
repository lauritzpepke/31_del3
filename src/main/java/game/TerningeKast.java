package game;

public class TerningeKast {
    private int dieValue;
    Terning die = new Terning();

    public void throwTheDie() {
        die.roll();
        dieValue = die.getValue();
    }

    public int getDieValue() {
        return dieValue;
    }

}
