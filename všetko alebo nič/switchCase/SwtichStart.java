package switchCase;

import java.util.Scanner;

public class SwtichStart {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String animal;
        System.out.println("zadaj meno zvieraťa");
        animal = sc.nextLine();
        boolean repeat = true; // Premenná na určenie, či sa má program opakovať


        switch (animal) {
            case "dog":
                System.out.println("hav-hav");
                break;

            case "cat":
                System.out.println("mnau-mnau");
                break;

            case "goat":
                System.out.println("beee");
                break;

            case "chicken":
                System.out.println("kot-kot-dak");

                break;
            case "snake":
                System.out.println("psss");
                break;

            default:
                System.out.println("Zadal si zviera mimo rozsahu");
                break;
        }
    }
}
