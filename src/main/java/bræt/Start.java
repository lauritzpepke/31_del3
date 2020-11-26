package bræt;


import bræt.OverordnedeFelter;
import game.Spiller;
import gui_main.GUI;

// Klassen "Start" nedarves fra OverordnedeFelter
// Klassen "Start" består af startfeltets funktion



public class Start extends OverordnedeFelter {

    private final int startbonus = 2;

    public Start (int feltnr, GUI gui) {
        super(feltnr, gui);
    }

//Udskrivelsen af toString beskeden er når en spiller lander enten på start eller passere start feltet.

    public String toString() {
        if(feltnr == 0) {
            return "Du har landet på start, og vil derfor modtage en startbonus på " + startbonus + "M";
    }
        else{
            return "Du har passeret start, og vil derfor modtage en startbonus på " + startbonus + "M";

        }
    }

// Nedensåtende medtode er udskrivelsen af teksten fra toString for startfeltet.

    public void landOnField(Spiller spiller) {
        gui.showMessage(toString());

    }

}

