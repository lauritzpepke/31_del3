package game;

import java.awt.*;

public class Spiller {
    private String navn;
    private int alder;
    private int placering = 0;
    private Color farve;
    private boolean fængsel;
    private boolean gratis;
    private boolean frikort;
    BankKonto bk = new BankKonto();

    public Spiller(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }

    public void skiftPlacering() {

    }

    public void setPlacering() {
        this.placering = placering;
    }

    public int getPlacering() {
        return placering;
    }

    public void setFarve(Color farve) {
        this.farve = farve;
    }

    public Color getFarve() {
        return farve;
    }

    public void setFængsel(boolean fængsel) {
        this.fængsel = fængsel;
    }

    public boolean isFængsel() {
        return fængsel;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setFrikort(boolean frikort) {
        this.frikort = frikort;
    }

    public boolean isFrikort() {
        return frikort;
    }

}
