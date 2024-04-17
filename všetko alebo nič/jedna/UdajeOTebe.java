package jedna;
import java.util.Scanner;
public class UdajeOTebe {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarácia premenných
        String meno;
        String priezvisko;
        int roknarodenia;
        char a;
        char b;
        int vek;

// prijatie z klávesnice
        System.out.println("Zadaj svoje meno, priezvisko a rok narodenia ");
        meno = scanner.nextLine();
        priezvisko = scanner.nextLine();
        roknarodenia = scanner.nextInt();
// spracovanie dát
        a = meno.charAt(0);
        b = priezvisko.charAt(0);

        vek = 2024 - roknarodenia;
        System.out.println("vystup:" + a + b + vek);

    }
}