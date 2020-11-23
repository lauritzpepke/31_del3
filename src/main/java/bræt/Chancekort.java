package main.java.bræt;
/*
 * @author Gruppe31
 * Chancekort_klassen fremkalder chancekort
 */

public class Chancekort {
    /*
     * Vi vil nu erklære et String array ved navn "kort"
     */
    private String[] kort;

    public Chancekort(){ FremkaldChancekort(); }

    // Her instantieres String[] kort
    // I spillet er der 16 chancekort, som bliver gemt(som vi mener er mest relevant at have med),
    // og så har vi nedstående tænkt os at lave et String array ved navn "FremkaldChancekort**/
    public void FremkaldChancekort () {

        kort = new String [16];
        kort [0] = "Chance1#Ryk op til 5 felter frem.";
        kort [1] = "Chance2#Ryk frem til START, og modtag M2";
        kort [2] = "Chance3#Ryk 1 felt, eller tag et chancekort mere";
        kort [3] = "Chance4#GRATIS FELT! Ryk frem til et orange felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [4] = "Chance5#Du har spist for meget slik. BETAL M2 til banken";
        kort [5] = "Chance6#GRATIS FELT! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [6] = "Chance7#GRATIS FELT! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [7] = "Chance8#Ryk frem til Strandpromenaden.";
        kort [8] = "Chance9#Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det.";
        kort [9] = "Chance10#GRATIS FELT! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [10] = "Chance11#Det er din fødselsdag! Alle giver dig M1. TILLYKKE MED FØDSELDAGEN!";
        kort [11] = "Chance12#GRATIS FELT! Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den, får du den GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [12] = "Chance13#GRATIS FELT! Ryk frem til et rødt felt. Hvis det er ledigt, får du det GRATIS! Eller skal du BETALE leje til ejeren.";
        kort [13] = "Chance14#Du har lavet alle dine lektier. MODTAG M2 fra banken.";
        kort [14] = "Chance15#GRATIS FELT! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";
        kort [15] = "Chance16#GRATIS FELT! Ryk frem til et brunt eller gult felt. Hvis det er ledigt, får du det GRATIS! Ellers skal du BETALE leje til ejeren.";

        blandKort();
    }
    //Nedstående metode vil kunne trække det øverste chancekort i ´bunken´ ved hjælp af for-loop,
    //og så efterfølgende retureres chancekortet (@return), som der blev trukket

    public String trukketKort(){
        String kort1 = kort[0];
        for(int i =0; i<kort.length-1;i++){
            kort[i] = kort[i+1];
        }
        kort[kort.length-1] = kort1;
        return kort1;
    }

    //Metoden nedenfor blandes bunken med chancekortene, så man får trukket "tilfældigt" et chancekort.
    //Metoden benytter Math.random, så bliver der tilgivet en "random"-placering for chancekortene.

    public void blandKort(){
        String [] kort1 = kort;
        int i = 0;
        kort1 = new String[kort.length];
        while(i < kort1.length) {
            int værdi =(int)(Math.random()*kort1.length);
            if (kort1[værdi]== null){
                kort1[værdi] = kort [i];
                i++;
            }
        }
        kort = kort1;
    }
}