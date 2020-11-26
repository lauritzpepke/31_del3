package bræt;

import game.Spiller;
import gui_main.GUI;

//@author gruppe 31
// Denne klasse er ikke inaktiv, men den bruges til at etablere inaktive felter på spillebrættet
// Felterne "gratis parkering" og "på besøg i fængslet" har ikke nogen særlige funktioner, derfor kalder vi denne klasse for inaktiv
// Inaktiv-Klassen nedarver fra Overordnedefelter



public class Inaktiv extends bræt.OverordnedeFelter {
    private String feltNavn;

    // Vi laver nu en konstruktør, der angiver de inaktive felters placering på spillebrættet ud fra feltnumrene
    // Så har parametrene @param feltnr. og @param gui viser placeringerne på spillebrættet

    public Inaktiv (int feltnr, GUI gui) {
        super(feltnr, gui);
        switch (feltnr) {
        case 6: feltNavn = "på besøg";
        break;
        case 12: feltNavn = "gratis parkering";
        break;
        default:
            break;
        }
    }
    // Her der vil toString bruges til at udskrive tekstbeskrivelse,
    // når den pågældende spiller lander enten på Felterne "gratis parkering" eller "på besøg i fængslet"
    //@return string

    @Override
    public String toString (){
        if (feltNavn.equals("på besøg"))
            return "Du er egentlig bare" + feltNavn;
        else
            return feltNavn + ", du skal ikke foretage dig noget som helst, bare tag dig en slapper";
    }
    // Her vil vi benytte metoden, som frembringer tekstbeskrivelse fra toString for de to inaktive felter
    // Så vores parameter her er @param Spiller
    @Override
    public void landOnField(Spiller spiller) { gui.showMessage(toString()); }
}
