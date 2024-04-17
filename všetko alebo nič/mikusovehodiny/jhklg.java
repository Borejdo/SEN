package mikusovehodiny;
import java.util.Scanner;
public class jhklg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadaj A: ");
        double hodnotaA = sc.nextDouble();

        System.out.println("Zadaj B: ");
        double hodnotaB = sc.nextDouble();

        if (hodnotaA > hodnotaB) {
            System.out.println("A je väčšie");
        } else if (hodnotaA < hodnotaB)
            System.out.println("B je väčšie");
    else
        System.out.println("rovnaju sa");
    }
}
