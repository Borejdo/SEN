package babiakovehodiny;

import java.util.Calendar;
import java.util.Scanner;

public class Help {
    Scanner scanner = new Scanner(System.in);

    // Metóda na získanie mena od používateľa
    public String ziskajMeno() {
        System.out.print("Zadajte svoje meno: ");
        return scanner.nextLine();
    }

    // Metóda na získanie priezviska od používateľa
    public String ziskajPriezvisko() {
        System.out.print("Zadajte svoje priezvisko: ");
        return scanner.nextLine();
    }

    // Metóda na získanie roka narodenia od používateľa
    public int ziskajRokNarodenia() {
        System.out.print("Zadajte rok narodenia: ");
        return scanner.nextInt();
    }

    // Metóda na zistenie iniciály z mena
    public char zistiInicial(String text) {
        return text.charAt(0);
    }

    // Metóda na zistenie veku na základe roku narodenia
    public int zistiVek(int rokNarodenia) {
        int aktualnyRok = Calendar.getInstance().get(Calendar.YEAR);
        return aktualnyRok - rokNarodenia;
    }
}

