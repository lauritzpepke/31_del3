package bræt;

import game.Spiller;
import gui_main.GUI;

/* @author Gruppe 31
* Denne her Chance-klasse har til formål at føre chancekortenes foretagelser ud,
* som også derved vil få udskrevet chancekorten inde på gui´en.
 */
public class Chance extends OverordnedeFelter {
    private Chancekort chance = new Chancekort ();
    private String chanceTekstbeskrivelse;

    /**
     * Vi laver en konstruktør, der tager feltnumre (tilenumre) og gui´en som dens parametre
     * Altså vores parametre er @param tile/feltnr og @param gui
     */
    public Chance(int feltnr, GUI gui){
        super(feltnr, gui);
    }

    @Override
    public String toString(){ return "Du har nu landet på Chance, nu skal du bare trykke FORTSÆT for at trække et chancekort.";}

    public void set Chancekort() {this.chanceTekstbeskrivelse = chance.trukketKort();}

    public String getChancekort(){ return chanceTekstbeskrivelse.split("#")[1];}

    /**
     * Metoden fra OverordnedeFelter bliver "overridet" af landOnField
     * Metoden indeholder felt-logikken for chance
     * Vores er parameter er @param Spiller/Player
     */
    @Override
    public void landOnField (Spiller spiller){
        String felt;
        gui.showMessage(toString());
        setChancekort();
        boolean nytKort=true;
        while (nytKort==true) {
            nytKort = false;
            switch (chanceTekstbeskrivelse.split("#")[0]) {
            case "Chance1":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("");
                spiller.setPlacering(0);
                break;
            case "Chance2":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvor mange felter vil du rykke frem?", "0", "1", "2", "3", "4", "5");
                spiller.opdaterPlacering(Integer.parseInt(felt));
                break;
            case "Chance3":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket orange felt vil du rykke frem til?", "16", "17");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance4":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserButtonPressed("Vil du rykke et felt frem eller tage et chancekort?", "Ryk et felt frem", "Tag chancekort");
                if (felt.equals("Ryk et felt frem")) {
                        spiller.setPlacering(spiller.getPlacering() + 1);
                }
                else{
                    setChancekort();
                    nytKort = true;
                }
                break;
            case "Chance5":
                    gui.setChanceCard(getChancekort());
                    gui.displayChanceCard();
                    gui.showMessage("Du skal betale 2M til banken")
                    spiller.ændrBalance(-2);
                    break;
            case "Chance6":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket orange eller grønt felt vil du rykke frem til?", "16", "17", "19", "20");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance7":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket lyseblåt felt vil du rykke frem til?", "4", "5");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance8":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("Du har fået et fængsel-frikort");
                spiller.setFrikort(true);
                break;
            case "Chance9":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("Ryk frem til Strandpromenaden");
                spiller.setPlacering(23);
                break;
            case "Chance10":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("");
                spiller.setFødselsdag(true);
                break;
            case "Chance11":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket lyseblåt felt vil du rykke frem til?", "7", "8", "22", "23");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance12":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("");
                spiller.ændrLikvideMidler(2);
                break;
            case "Chance13":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket lyseblåt felt vil du rykke frem til?", "13", "14");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance14":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                gui.showMessage("Ryk frem til Skaterparken");
                spiller.setGratis(true);
                spiller.setPlacering(10);
                break;
            case "Chance15":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket lyseblåt felt vil du rykke frem til?", "4", "5", "13", "14");
                spiller.setGratis(true);
                spiller.setPlacering(Integer.parseInt(felt));
                break;
            case "Chance16":
                gui.setChanceCard(getChancekort());
                gui.displayChanceCard();
                felt = gui.getUserSelection("Hvilket lyseblåt felt vil du rykke frem til?", "1", "2", "10", "11");
                spiller.setPlacering(Integer.parseInt(felt));
                spiller.setGratis(true);
                break;
            default:
                break;
            }
        }
    }
}