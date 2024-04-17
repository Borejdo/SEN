package switchCase;
import java.util.Scanner;
    public class Ulohaswitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj deň (1 pre pondelok, 2 pre utorok, atd.): ");
        int den = scanner.nextInt();
        int dniDoVikendu;

        switch (den) {
            case 1:
                dniDoVikendu = 5;
                break;
            case 2:
                dniDoVikendu = 4;
                break;
            case 3:
                dniDoVikendu = 3;
                break;
            case 4:
                dniDoVikendu = 2;
                break;
            case 5:
                dniDoVikendu = 1;
                break;
            case 6:
            case 7:
                System.out.println("Je víkend!");
                return;
            default:
                System.out.println("Neplatný deň.");
                return;
        }

        System.out.println("Pocet dni do vikendu: " + dniDoVikendu);
    }
}
