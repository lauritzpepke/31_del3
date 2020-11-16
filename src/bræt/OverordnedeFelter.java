// Metoder i klassen er ikke færdige, da klassen er overordnet
// * I de nedarvede klasser bliver metoderne "overridet"
// Felterne her er overordnede, dog bliver de belyst i den nedarvede klasser

package bræt;

import game.Spiller;
import gui_main.GUI;

public abstract class OverordnedeFelter {

// Vi anvender "protected", så de kan tilgængelig for pakken og hermed de nedarvede klasser

    protected int feltnr;
    protected GUI gui;

    public OverordnedeFelter(int feltnr, GUI gui){
        this.feltnr = feltnr;
        this.gui = gui;
    }

    public abstract String toString ();

    public abstract void landOnField (Spiller spiller);
}
