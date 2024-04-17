package mikusovehodiny.tahodinavpiatok;

public class Main {
public static void main(String[] args) {

    Helper hlp = new Helper();
    String menoObjednavky;
    int pocetKnih;
    double cenaKnihy;
    double sucet=0;

    menoObjednavky = hlp.ziskajMenoObjednavky();
    pocetKnih = hlp.ziskajPocetKnih();


    for (int i = 0; i < pocetKnih; i++) {
        cenaKnihy = hlp.zistiCenuKnihy();
        System.out.println("Cena jednej knihy je:" + cenaKnihy);
        sucet += cenaKnihy;
        System.out.println("Meno objednavky: " + menoObjednavky);
        System.out.println("Cena s DPH: " + hlp.VypocitajCenuDPH(sucet));
    }
    }
}