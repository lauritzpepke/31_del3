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

    // kør metode for nye spillere, return værdi af antal spillere
    String antalSpillere_string = gui.getUserButtonPressed("Indtast hvor mange spillere i er fra 2-4.", "2", "3", "4");
   int antalSpillere = Integer.parseInt(antalSpillere_string);

   if (antalSpillere == 2) {
       int startBalance = 20;
   }
   else if (antalSpillere == 3) {
       int startBalance = 18;
   }
   else if (antalSpillere == 4) {
       int startBalance = 16;
   }

   Scanner sc = new Scanner(System.in);
   String fåNavn = gui.getUserSelection("Hvad er dit navn?", sc.nextLine());

   Spiller[] spillerArray = new Spiller[antalSpillere];
   GUI_Car[] bil = new GUI_Car[4];

    for (int i = 0; i < antalSpillere; i++) {
        spillerArray[i] = new Spiller(fåNavn, startBalance , bil[i] );
    }

    // bruger gui

    // få info fra spillere
    // MINDST 2 spillere MAKS 4


























    // opret spillere
    /**
     * Oprettet forskellige objekter og array's
     */
    String[] navn = new String[4];
    GUI_Player[] spillere = new GUI_Player[4];
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




