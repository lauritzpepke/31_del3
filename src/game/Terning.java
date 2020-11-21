package game;


import java.util.Random;

public class Terning {
    private int value;
    private Random r;
    private int numberOfSides;

    public Terning() {
        r = new Random();
        numberOfSides = 6;
    }

    public int roll() {
        value = r.nextInt(numberOfSides) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }



}
