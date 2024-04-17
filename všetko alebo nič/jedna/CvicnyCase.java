package jedna;
import java.util.Scanner;
public class CvicnyCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Napis cislo od 1 do 3 ");
        int volba = scanner.nextInt();
        String Vypis = switch (volba) {
            case 1 -> "Zadal si jednotku";
            case 2 -> "Zadal si dvojku";
            case 3 -> "Zadal si trojku";
            default -> "nebud tlk";
        };
        System.out.println("Zadal si:" + Vypis);
        scanner.close();

    }
}