package game;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import java.awt.*;
import java.util.Scanner;

import gui_main.GUI;

public class Spil {
    static TerningeKast dieThrow = new TerningeKast();
    UI ui = new UI();

public static void playGame()
{
    Bræt b = new Bræt();
    GUI gui = new GUI(b.Bræt());

    // kør metode for nye spillere
    String antalSpillere_string = gui.getUserButtonPressed("Indtast hvor mange spillere i er fra 2-4.", "2", "3", "4");
   int antalSpillere = Integer.parseInt(antalSpillere_string);

   int startBalance = 0;

   if (antalSpillere == 2) {
       startBalance = 20;
   }
   else if (antalSpillere == 3) {
       startBalance = 18;
   }
   else if (antalSpillere == 4) {
       startBalance = 16;
   }

   Spiller[] spillerArray = new Spiller[antalSpillere];
   GUI_Car[] bil = new GUI_Car[antalSpillere];
    GUI_Player[] spillere = new GUI_Player[antalSpillere];

   String fåNavn;
    for (int i = 0; i < spillerArray.length ; i++) {
        fåNavn = gui.getUserString("Hvad er dit navn?");
        spillerArray[i] = new Spiller(fåNavn, startBalance, bil[i]);
        spillere[i] = new GUI_Player(fåNavn, startBalance, bil[i]);
    }





























    // opret spillere
    /**
     * Oprettet forskellige objekter og array's
     */
    String[] navn = new String[4];
    Color[] farve = {Color.red, Color.BLUE, Color.green, Color.yellow};
    CheckTaber taber = new CheckTaber();



    // switch(antalSpillere) {
      //  case 2:
        //    spillere[] =new GUI_Player(navn[],20, bil[]);
        //    break;
       // case 3:
        //    spillere[] =new GUI_Player(navn[],18, bil[]);
       //     break;
       // case 4:
      //      spillere[] =new GUI_Player(navn[],16, bil[]);
        //    break;
      //  default:
       //     break;
   // }


}


    // rækkefølge baseret på alder


    // start gui for selve spillet

    // kør spil indtil en går fallit


    //bestem vinder


    }




