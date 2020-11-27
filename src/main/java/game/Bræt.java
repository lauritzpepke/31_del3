package game;

import bræt.OverordnedeFelter;
import java.awt.Color;

import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Street;


/**
 * Klasse der indeholder brættet til spillet
 */
public class Bræt {
    private GUI_Field[] fields = new GUI_Field[24];
    private OverordnedeFelter[] felter = new OverordnedeFelter[24];

    /**
     * Lavet et felt-array
     */
    private Felt[] tiles;

    /**
     * Lavet 24 felter i arrayet og givet dem værdier
     */
    public Bræt() {
        tiles = new Felt[24];
        tiles[0] = new Felt("Start", 0, "Start", -2);
        tiles[1] = new Felt("ownable", 1, "Burgerbaren", 1);
        tiles[2] = new Felt("ownable", 1, "Pizzariaet", 1);
        tiles[3] = new Felt("chance", 0, "Chance", 0);
        tiles[4] = new Felt("ownable", 2, "Slikbutikken", 1);
        tiles[5] = new Felt("ownable", 2, "Iskiosken", 1);
        tiles[6] = new Felt("Jail", 0, "På besøg", 0);
        tiles[7] = new Felt("ownable", 3, "Museet", 2);
        tiles[8] = new Felt("ownable", 3, "Biblioteket", 2);
        tiles[9] = new Felt("chance", 0, "Chance", 0);
        tiles[10] = new Felt("ownable", 4, "Skaterparken", 2);
        tiles[11] = new Felt("ownable", 4, "Swimmingpool", 2);
        tiles[12] = new Felt("Park", 0, "Gratis parkering", 0);
        tiles[13] = new Felt("ownable", 5, "Spillehallen", 3);
        tiles[14] = new Felt("ownable", 5, "Biografen", 3);
        tiles[15] = new Felt("chance", 0, "Chance", 0);
        tiles[16] = new Felt("ownable", 6, "Legetøjsbutikken", 3);
        tiles[17] = new Felt("ownable", 6, "Dyrebutikken", 3);
        tiles[18] = new Felt("Go to jail", 0, "Gå i fængsel", 0);
        tiles[19] = new Felt("ownable", 7, "Bowlinghallen", 4);
        tiles[20] = new Felt("ownable", 7, "Zoologisk have", 4);
        tiles[21] = new Felt("chance", 0, "Chance", 0);
        tiles[22] = new Felt("ownable", 8, "Vandlandet", 5);
        tiles[23] = new Felt("ownable", 8, "Strandpromenaden", 5);
    }

    /**
     * Metode der retunere felterne
     * @return felterne i felt-arrayet
     */
    public Felt[] getTiles() {
        return tiles;
    }

    public GUI_Field [] Bræt() {

        fields[0] = new GUI_Street();
        fields[0].setTitle("Start");
        fields[0].setDescription("");
        fields[0].setSubText("");
        fields[0].setBackGroundColor(Color.RED);

        fields[1] = new GUI_Street();
        fields[1].setTitle("Burgerbaren");
        fields[1].setDescription("");
        fields[1].setSubText("1");
        fields[1].setBackGroundColor(new Color(153,102,0)); // Light brown

        fields[2] = new GUI_Street();
        fields[2].setTitle("Pizzariaet");
        fields[2].setDescription("");
        fields[2].setSubText("1");
        fields[2].setBackGroundColor(new Color(153,102,0)); // Light brown

        fields[3] = new GUI_Chance();

        fields[4] = new GUI_Street();
        fields[4].setTitle("Slikbutikken");
        fields[4].setDescription("");
        fields[4].setSubText("1");
        fields[4].setBackGroundColor(new Color(51, 204, 255));

        fields[5] = new GUI_Street();
        fields[5].setTitle("Iskiosken");
        fields[5].setDescription("");
        fields[5].setSubText("1");
        fields[5].setBackGroundColor(new Color(51, 204, 255));

        fields[6] = new GUI_Jail();
        fields[6].setSubText("På besøg");

        fields[7] = new GUI_Street();
        fields[7].setTitle("Museet");
        fields[7].setDescription("");
        fields[7].setSubText("2");
        fields[7].setBackGroundColor(new Color(204, 0, 100)); // Red wine red

        fields[8] = new GUI_Street();
        fields[8].setTitle("Biblioteket");
        fields[8].setDescription("");
        fields[8].setSubText("2");
        fields[8].setBackGroundColor(new Color(204, 0, 100)); // Red wine red

        fields[9] = new GUI_Chance();

        fields[10] = new GUI_Street();
        fields[10].setTitle("Skaterparken");
        fields[10].setDescription("");
        fields[10].setSubText("2");
        fields[10].setBackGroundColor(Color.YELLOW);

        fields[11] = new GUI_Street();
        fields[11].setTitle("Swimmingpool");
        fields[11].setDescription("");
        fields[11].setSubText("2");
        fields[11].setBackGroundColor(Color.YELLOW);

        fields[12] = new GUI_Refuge();
        fields[12].setDescription("Tag en pause");
        fields[12].setSubText("Gratis parkering");
        fields[12].setBackGroundColor(Color.white); //Very light red;

        fields[13] = new GUI_Street();
        fields[13].setTitle("Spillehallen");
        fields[13].setDescription("");
        fields[13].setSubText("3");
        fields[13].setBackGroundColor(new Color(204, 0, 0)); //Dark red;

        fields[14] = new GUI_Street();
        fields[14].setTitle("Biografen");
        fields[14].setDescription("");
        fields[14].setSubText("3");
        fields[14].setBackGroundColor(new Color(204, 0, 0)); //Dark red;

        fields[15] = new GUI_Chance();

        fields[16] = new GUI_Street();
        fields[16].setTitle("Lejetøjsbutikken");
        fields[16].setDescription("");
        fields[16].setSubText("3");
        fields[16].setBackGroundColor(new Color(255, 153,0)); //Gold

        fields[17] = new GUI_Street();
        fields[17].setTitle("Dyrehaven");
        fields[17].setDescription("");
        fields[17].setSubText("3");
        fields[17].setBackGroundColor(new Color(255, 153,0)); //Gold

        fields[18] = new GUI_Jail();
        fields[18].setTitle("Gå i fængsel");
        fields[18].setDescription("");
        fields[18].setSubText("Gå i fængsel");

        fields[19] = new GUI_Street();
        fields[19].setTitle("Bowlinghallen");
        fields[19].setDescription("");
        fields[19].setSubText("4");
        fields[19].setBackGroundColor(new Color(0, 153, 0)); //Green

        fields[20] = new GUI_Street();
        fields[20].setTitle("Zoo");
        fields[20].setDescription("");
        fields[20].setSubText("4");
        fields[20].setBackGroundColor(new Color(0, 153, 0)); //Green

        fields[21] = new GUI_Chance();

        fields[22] = new GUI_Street();
        fields[22].setTitle("Vandlandet");
        fields[22].setDescription("");
        fields[22].setSubText("5");
        fields[22].setBackGroundColor(Color.BLUE); //Very light blue

        fields[23] = new GUI_Street();
        fields[23].setTitle("Stranpromaden");
        fields[23].setDescription("");
        fields[23].setSubText("5");
        fields[23].setBackGroundColor(Color.BLUE); //Very light blue

        return fields;
        };
        }


