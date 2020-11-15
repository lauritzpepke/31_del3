package game;

public class Tile {
    String type, title;
    private int group, price;
    private int ownerNumber;

    public Tile(String type, int group, String title, int price) {
        this.type = type;
        this.group = group;
        this.title = title;
        this.price = price;
        this.ownerNumber = 0;
    }

    public void setOwnerNumber() {
        this.ownerNumber = ownerNumber;
    }

    public int getOwnerNumber() {
        return ownerNumber;
    }

    public String getType() {
        return type;
    }

    public int getGroup() {
        return group;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
