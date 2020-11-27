package game;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import java.awt.*;
import java.util.ArrayList;

import game.CheckTaber;
import gui_main.GUI;

public class Spil {
    private ArrayList<Spiller> spillerListe = new ArrayList<Spiller>();
    private GUIsamling GUIs = new GUIsamling();
    private int bankerotSpillere;
    private boolean ingenVinder;

    public static void playGame() {
        Bræt b = new Bræt();
        GUI gui = new GUI(b.Bræt());
        TerningeKast dieThrow = new TerningeKast();

        // kør metode for nye spillere
        String antalSpillere_string = gui.getUserButtonPressed("Indtast hvor mange spillere i er fra 2-4.", "2", "3", "4");
        int antalSpillere = Integer.parseInt(antalSpillere_string);

        int startBalance = 0;

        if (antalSpillere == 2) {
            startBalance = 20;
        } else if (antalSpillere == 3) {
            startBalance = 18;
        } else if (antalSpillere == 4) {
            startBalance = 16;
        }

        Spiller[] spillerArray = new Spiller[antalSpillere];
        GUI_Car[] bil = new GUI_Car[antalSpillere];
        GUI_Player[] spillere = new GUI_Player[antalSpillere];

        String fåNavn;
        for (int i = 0; i < spillerArray.length; i++) {
            fåNavn = gui.getUserString("Hvad er dit navn?");
            bil[i] = new GUI_Car();
            spillerArray[i] = new Spiller(fåNavn, startBalance, bil[i]);
            spillere[i] = new GUI_Player(fåNavn, startBalance, bil[i]);
        }

        for (int i = 0; i < spillere.length; i++) {
            gui.addPlayer(spillere[i]);
            GUI_Field field = gui.getFields()[0];
            field.setCar(spillere[i], true);
        }

        // kør spil indtil en går fallit
        CheckTaber taber = new CheckTaber();
        while (!taber.isCheckTaber()) {
            for (int i = 0; i < spillerArray.length; i++) {
                if (taber.isCheckTaber()) { // Tjekkem om spiller har tabt
                    break;
                }

                boolean yes = gui.getUserLeftButtonPressed("Vil du kaste terningen?", "Ja", "Nej");
                if (yes == true) {
                    dieThrow.throwTheDie();
                    gui.setDie(dieThrow.getDieValue());

                }


            }

        }

        //bestem vinder


    }

    private void checkForVinder() {
        for (int i = 0; i < spillerListe.size(); i++) {
            if (spillerListe.get(i).erBankerot() == false) {
                System.exit(0);
            }
        }
    }
}