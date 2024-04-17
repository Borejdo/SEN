package mikusovehodiny.main;
import java.util.Scanner;
public class Simplecatch {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Máš na výber 3 možnosti, ale píš iba čísla:");
    System.out.println("1. dobré ráno");
    System.out.println("2. dobrý deň");
    System.out.println("3. Dobrý večer");
    System.out.println("Eastregg");

    int vyber = scanner.nextInt();
    Pozdrav pozdravuj = new Pozdrav();
    switch (vyber) {
        case 1:
            pozdravuj.goodMorning();
            break;
        case 2:
            pozdravuj.goodDay();
            break;
        case 3:
            pozdravuj.goodEvening();
            break;
        case 4:
            pozdravuj.peter();
            break;
        default:
            System.out.println("JEBE ? také číslo tam neni");
    }
scanner.close();
}
}