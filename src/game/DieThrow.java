package game;

public class DieThrow {
    private int dieValue;
    Die die = new Die();

    public void throwTheDie() {
        die.roll();
        dieValue = die.getValue();
    }

    public int getDieValue() {
        return dieValue;
    }

}
