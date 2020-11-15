package game;

public class Board {
    private Tile[] tiles;

    public Board() {
        tiles = new Tile[24];
        tiles[0] = new Tile("Start", 0, "Start tile", -2);
        tiles[1] = new Tile("ownable", 1, "Burgerbar", 1);
        tiles[2] = new Tile("ownable", 1, "Pizzahouse", 1);
        tiles[3] = new Tile("chance", 0, "Chance", 0);
        tiles[4] = new Tile("ownable", 2, "Candystore", 1);
        tiles[5] = new Tile("ownable", 2, "Icecream store", 1);
        tiles[6] = new Tile("Jail", 0, "Jail visit", 0);
        tiles[7] = new Tile("ownable", 3, "Museum", 2);
        tiles[8] = new Tile("ownable", 3, "Library", 2);
        tiles[9] = new Tile("chance", 0, "Chance", 0);
        tiles[10] = new Tile("ownable", 4, "Skatepark", 2);
        tiles[11] = new Tile("ownable", 4, "Swimmingpool", 2);
        tiles[12] = new Tile("Park", 0, "Free parking", 0);
        tiles[13] = new Tile("ownable", 5, "Gaming hall", 3);
        tiles[14] = new Tile("ownable", 5, "Cinema", 3);
        tiles[15] = new Tile("chance", 0, "Chance", 0);
        tiles[16] = new Tile("ownable", 6, "Toy store", 3);
        tiles[17] = new Tile("ownable", 6, "Pet shop", 3);
        tiles[18] = new Tile("Go to jail", 0, "Go to jail", 0);
        tiles[19] = new Tile("ownable", 7, "Bowling hall", 4);
        tiles[20] = new Tile("ownable", 7, "Zoo", 4);
        tiles[21] = new Tile("chance", 0, "Chance", 0);
        tiles[22] = new Tile("ownable", 8, "Water park", 5);
        tiles[23] = new Tile("ownable", 8, "The beach", 5);
    }

    public Tile[] getTiles() {
        return tiles;
    }

}
