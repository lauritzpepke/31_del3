package game;

public class Bræt {
    private Felt[] tiles;

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

    public Felt[] getTiles() {
        return tiles;
    }

}
