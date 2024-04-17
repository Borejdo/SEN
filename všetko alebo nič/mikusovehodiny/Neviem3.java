package mikusovehodiny;
import java.util.Scanner;
public class Neviem3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Zadaj A ");
double a= sc.nextDouble();

    System.out.println("Zadaj B ");
    double b = sc.nextDouble();
    Kalkulator kalk = new Kalkulator();

    System.out.println("Súčet je: " + kalk.sucet(a,b));
    System.out.println("Násobok je: " + kalk.sucin(a,b));
    sc.close();
    }
}