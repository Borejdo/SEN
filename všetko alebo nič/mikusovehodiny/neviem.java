package mikusovehodiny;
import java.util.Scanner;
public class neviem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj cenu auta bez DPH: ");
        double cenaBezDPH = scanner.nextDouble();

        System.out.print("Zadaj hodnotu DPH v percentách: ");
        double dphPercenta = scanner.nextDouble();

        double dphCena = cenaBezDPH * (1 + (dphPercenta / 100));

        System.out.println("Cena auta s DPH: " + dphCena);

        scanner.close();
    }
}