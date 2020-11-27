package game;

import gui_fields.GUI_Car;

import java.awt.*;

public class Spiller {
    private String navn;
    private BankKonto bk;
    private int nuværendePlacering = 0;
    private static Color farve;
//    private boolean fængsel;
//    private boolean gratis;
//    private boolean frikort;
    private GUI_Car bil;
    private int rigdom;
    private int balance = 0;

    public Spiller(String navn, int balance, GUI_Car bil) {
        this.navn = navn;
        this.bk = new BankKonto(balance);
        this.bil = bil;
        rigdom = this.getBalance();
    }

    public String getNavn() {
        return navn;
    }

    public String toString() {
        return navn;
    }

    public int getBalance() {
        return bk.getBalance();
    }

    public void setBalance(int penge) {
        balance = balance + penge;
    }

    public int bevægSpiller(int move) {
        this.nuværendePlacering = nuværendePlacering + move;

        if (nuværendePlacering > 24) {
            nuværendePlacering = nuværendePlacering - 24;
    }
        return nuværendePlacering;
    }
}




//    public void setAlder(int alder) {
//        this.alder = alder;
//    }
//
//    public int getAlder() {
//        return alder;
//    }
//
//    public void setPlacering(int placering) {
//        this.placering = placering;
//    }
//
//    public int getPlacering() {
//        return placering;
//    }
//
//    public void skiftPlacering() {
//
//    }
//
//    public void setFarve(Color farve) {
//        this.farve = farve;
//    }
//
//    public static Color getFarve() {
//        return farve;
//    }
//
//    public void setFængsel(boolean fængsel) {
//        this.fængsel = fængsel;
//    }
//
//    public boolean isFængsel() {
//        return fængsel;
//    }
//
//    public void setGratis(boolean gratis) {
//        this.gratis = gratis;
//    }
//
//    public boolean isGratis() {
//        return gratis;
//    }
//
//    public void setFrikort(boolean frikort) {
//        this.frikort = frikort;
//    }
//
//    public boolean isFrikort() {
//        return frikort;
//    }
//
//    public boolean getGratis() {
//        return false;
//    }
//
//    public void tilførSkøde(int feltnr, int i) {
//    }
//
//    public boolean ejerEjendom(int makkerFeltnr) {
//        return false;
//    }
//
//    public void ændrLikvideMidler(int i) {
//    }
//
//    public void changeBalance(int i) {
//    }
//}
