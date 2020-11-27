package game;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import java.awt.*;
import gui_main.GUI;

public class Spil {
    static TerningeKast dieThrow = new TerningeKast();

public void playGame()
{

    // kør metode for nye spillere, return værdi af antal spillere
    int antalSpillere = UI.bestemAntalSpillere();

    // bruger gui
    // få info fra spillere
    // MINDST 2 spillere MAKS 4


    // opret spillere
    /**
     * Oprettet forskellige objekter og array's
     */
    String[] navn = new String[4];
    GUI_Player[] spillere = new GUI_Player[4];
    GUI_Car[] bil = new GUI_Car[4];
    Color[] farve = {Color.red, Color.BLUE, Color.green, Color.yellow};
    CheckTaber taber = new CheckTaber();


    Spiller[] spillerArray = new Spiller[antalSpillere];

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




