package jedna;
import java.util.Scanner;
public class pomoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Napis cislo od 1 do 3 ");
        int volba = scanner.nextInt();
        String Vypis = null;
        switch (volba) {
            case 1:
                Vypis = "Zadal si jednotku";
                break;
            case 2:
                Vypis = "Zadal si dvojku";
                break;
            case 3:
                Vypis = "Zadal si trojku";
                break;
            default:
        }
        System.out.println("Zadal si:" + Vypis);
        scanner.close();


    }
}