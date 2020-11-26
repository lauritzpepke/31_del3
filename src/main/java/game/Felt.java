package game;

public class Felt {
    String type, title;
    private int group, price;
    private int ownerNumber;

    /**
     * Constructor for felt som skal bruges i bræt-klassen
     */
    public Felt(String type, int group, String title, int price) {
        this.type = type;
        this.group = group;
        this.title = title;
        this.price = price;
        this.ownerNumber = 0;
    }

    /**
     * Metode der angiver ejernummer
     */
    public void setOwnerNumber() {
        this.ownerNumber = ownerNumber;
    }

    /** Metode der henter ejernummer
     * @return ownerNumber
     */
    public int getOwnerNumber() {
        return ownerNumber;
    }

    /**
     * Metode der henter hvilken type feltet er
     * @return hvilken type feltet er
     */
    public String getType() {
        return type;
    }

    /**
     * Metode som henter gruppenummeret på feltet
     * @return hvilken gruppe/kategori feltet hører inden under
     */
    public int getGroup() {
        return group;
    }

    /**
     * Metode som henter titlen på feltet
     * @return titlen på feltet
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metode der henter prisen på feltet
     * @return prisen på det specifikke felt
     */
    public int getPrice() {
        return price;
    }
}
