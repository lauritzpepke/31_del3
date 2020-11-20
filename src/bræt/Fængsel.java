package bræt;

import game.Spiller;
import gui_main.GUI;


// Klassen "Fængsel" nedarves fra OverordnedeFelter


public class Fængsel extends OverordnedeFelter {

    public Fængsel (int feltnr, GUI gui) {
        super(feltnr, gui);
    }

// Udskrivelsen af toString beskeden, er når en spiller lander på et felt

    public String toString(){
        return "Du er blevet busted i at stjæle slik, og skal derfor i fængsel";
    }

    public void setFængsel(Spiller spiller) {
        spiller.setPlacering(6);
    }

// landOnField består af fængselfeltets spil logik

    public void landOnField(Spiller spiller) {
        gui.showMessage(toString());
        setFængsel(spiller);
        spiller.setFængsel(true):
    }

}
