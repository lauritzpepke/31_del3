package game;


import java.util.Random;

/**
 * Klassen skaber en 6-sidet terning
 */
public class Terning {
    private int value;
    private Random r;
    private int numberOfSides;

    /**
     * Constructor for terningen som skal bruges i terningekast-klassen
     */
    public Terning() {
        r = new Random();
        numberOfSides = 6;
    }

    /**
     * Metode der ruller terningen og returnere værdien
     * @return værdien som blev fremstillet af at rulle med terningen
     */
    public int roll() {
        value = r.nextInt(numberOfSides) + 1;
        return value;
    }

    /**
     * Metode der henter resultatet af roll-metoden
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Metode som henter antal sider på terningen
     * @return antal sider som terningen har
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }



}
