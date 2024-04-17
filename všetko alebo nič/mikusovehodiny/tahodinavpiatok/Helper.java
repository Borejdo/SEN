package mikusovehodiny.tahodinavpiatok;
import java.util.Scanner;
public class Helper {
    Scanner scan = new Scanner(System.in);
    public double osetricislo (double cisloVstup) {
        if (cisloVstup <= 0) {
            System.out.println("Zadaj číslo väčšie ako 0");
            cisloVstup = osetricislo(scan.nextDouble());
        }
        return cisloVstup;
    }
    public String ziskajMenoObjednavky() {
        System.out.println("Ziskaj meno objednavky: ");
        return scan.nextLine();
    }
    public int ziskajPocetKnih() {
        System.out.println("Zadaj počcet kníh v objednávke: ");
        return (int) osetricislo(scan.nextInt());
    }
    public double zistiCenuKnihy() {
        System.out.println("Zadaj zadaj cenu jednej knihy");
        return osetricislo(scan.nextDouble());
    }
    public double VypocitajCenuDPH(double cenaknihy) {
        return cenaknihy + (cenaknihy *0.2);

    }
}
