package game;

public class Board {
    private Tile[] tiles;

    public Board() {
        tiles = new Tile[24];
        tiles[0] = new Tile("Start", 0, "Start", -2);
        tiles[1] = new Tile("ownable", 1, "Burgerbaren", 1);
        tiles[2] = new Tile("ownable", 1, "Pizzariaet", 1);
        tiles[3] = new Tile("chance", 0, "Chance", 0);
        tiles[4] = new Tile("ownable", 2, "Slikbutikken", 1);
        tiles[5] = new Tile("ownable", 2, "Iskiosken", 1);
        tiles[6] = new Tile("Jail", 0, "På besøg", 0);
        tiles[7] = new Tile("ownable", 3, "Museet", 2);
        tiles[8] = new Tile("ownable", 3, "Biblioteket", 2);
        tiles[9] = new Tile("chance", 0, "Chance", 0);
        tiles[10] = new Tile("ownable", 4, "Skaterparken", 2);
        tiles[11] = new Tile("ownable", 4, "Swimmingpool", 2);
        tiles[12] = new Tile("Park", 0, "Gratis parkering", 0);
        tiles[13] = new Tile("ownable", 5, "Spillehallen", 3);
        tiles[14] = new Tile("ownable", 5, "Biografen", 3);
        tiles[15] = new Tile("chance", 0, "Chance", 0);
        tiles[16] = new Tile("ownable", 6, "Legetøjsbutikken", 3);
        tiles[17] = new Tile("ownable", 6, "Dyrebutikken", 3);
        tiles[18] = new Tile("Go to jail", 0, "Gå i fængsel", 0);
        tiles[19] = new Tile("ownable", 7, "Bowlinghallen", 4);
        tiles[20] = new Tile("ownable", 7, "Zoologisk have", 4);
        tiles[21] = new Tile("chance", 0, "Chance", 0);
        tiles[22] = new Tile("ownable", 8, "Vandlandet", 5);
        tiles[23] = new Tile("ownable", 8, "Strandpromenaden", 5);
    }

    public Tile[] getTiles() {
        return tiles;
    }

}
