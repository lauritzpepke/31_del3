package bræt;

import game.Spiller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_main.GUI;


// Klassens ejendom nedarver fra OverordnedeFelter.
// De forskellig klasser stå for oprettelsen af ejendomsfelterne og deres individuelle pris og egenskaber på brættet.


public class Ejendom extends bræt.OverordnedeFelter {

    private boolean tilsalg = true;
    private int pris;
    private Spiller spiller;
    private String feltNavn;

    private int makkerFeltnr;

// Konstruktøren tager parametrene feltnr og gui.
// Konstruktøren består af en switch statement, hvor hver case har et feltnr,
// som bestå udfra et feltnr, feltets navn, pris og makkerfelt.
// Parameter: feltnr
// Parameter: gui

    public Ejendom(int feltnr, GUI gui) {
        super(feltnr, gui);
        switch (feltnr){
            case 1: feltNavn = "Brugerbaren"; pris = 1; makkerFeltnr = 2;
            break;
            case 2: feltNavn = "Pizzariaet"; pris = 1; makkerFeltnr = 1;
            break;
            case 4: feltNavn = "Slikbutikken"; pris = 1; makkerFeltnr = 5;
            break;
            case 5: feltNavn = "Iskiosken"; pris = 1; makkerFeltnr = 4;
            break;
            case 7: feltNavn = "Museet"; pris = 2; makkerFeltnr = 8;
            break;
            case 8: feltNavn = "Biblioteket"; pris = 2; makkerFeltnr = 7;
            break;
            case 10: feltNavn = "Skaterparken"; pris = 2; makkerFeltnr = 11;
            break;
            case 11: feltNavn = "Svømmebassenget"; pris = 2; makkerFeltnr = 10;
            break;
            case 13: feltNavn = "Spillehallen"; pris = 3; makkerFeltnr = 14;
            break;
            case 14: feltNavn = "Biografen"; pris = 3; makkerFeltnr = 13;
            break;
            case 16: feltNavn = "Lejetøjsbutikken"; pris = 3; makkerFeltnr = 17;
            break;
            case 17: feltNavn = "Dyrehaven"; pris = 3; makkerFeltnr = 16;
            break;
            case 19: feltNavn = "Bowlinghallen"; pris = 4; makkerFeltnr = 20;
            break;
            case 20: feltNavn = "Zoo"; pris = 4; makkerFeltnr = 19;
            break;
            case 22: feltNavn = "Vandlandet"; pris = 5; makkerFeltnr = 23;
            break;
            case 23: feltNavn = "Strandpromenaden"; pris = 5; makkerFeltnr = 22;
            // Vi har valgt ikke at benytte os af defualt, da vi ved at vi ikke kan ende dertil.
            default:
                break;
        }
    }

// Anvendelsen af toString er til udskrivning af beskeden, når spilleren lander på et felt.

    public String toString(){
        return "Du er landet på " + feltNavn;
    }



// setEjer sætter ejeren på ejendomsfeltet og markerer feltet med spillerens farve.
    public void setEjer(Spiller spiller) {
        GUI_Field f = gui.getFields()[feltnr];
        if(f instanceof GUI_Ownable){
            GUI_Ownable o = (GUI_Ownable) f;
            o.setBorder(Spiller.getFarve(), Spiller.getFarve());
        }
        this.spiller = spiller;
    }

    public Spiller getEjer() {
        return spiller;
    }

    public void setTilsalg(boolean tilsalg) {
        this.tilsalg = tilsalg;
    }

// Denne metode (return) er til at se om at ejendomsfelt er til salg


    public boolean isTilsalg() {
        return tilsalg;
    }


// landOnField er ejendommens felt
// Vi anvender metoden til at se om spilleren skal købe feltet, betale husleje
// eller ved at få et chancekort feltet gratis.

    public void landOnField(Spiller spiller) {

// Hvis ejendommen er til salg, altså hvis spilleren får den gratis - feks. ved chancekort.

        if (spiller.getGratis() && isTilsalg()) {
            gui.showMessage(toString() + " og får grunden gratis");
            spiller.tilførSkøde(feltnr, 0);
            setTilsalg(false);
            setEjer(spiller);
            spiller.setGratis(false);
        }
// Hvis ejendommen er til salg og man vil købe den:
        else if (isTilsalg()) {
            gui.showMessage(toString() + " og grunden købes for " + pris + "M");
            spiller.tilførSkøde(feltnr, pris);
            setTilsalg(false);
            setEjer(spiller);
            spiller.setGratis(false);
        }

//Hvis ejendommen ejes, og der skal betales for huslejen:
        else if (!isTilsalg() && getEjer() != spiller) {
            // Ejeren af feltet også ejer et andet felt i samme farve:
            if (getEjer().ejerEjendom(makkerFeltnr)) {
                gui.showMessage(toString() + ". Da " + getEjer().getNavn() + " også ejer det andet felt af samme farve skal " + spiller.getNavn() + " betale dobbelt pris," + (2 * pris) + "M til " + getEjer().getNavn());
                getEjer().ændrLikvideMidler(2 * pris);
                spiller.ændrLikvideMidler(-2 * pris);

            }
            else {
                gui.showMessage(toString() + " og skal betale " + pris + "M til " + getEjer().getNavn());
                getEjer().ændrLikvideMidler(pris);
                spiller.ændrLikvideMidler(-pris);
            }
            spiller.setGratis(false);
        }

    }
}
