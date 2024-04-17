package funkcie;
import java.util.Scanner;
public class FunkciePriklady {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Zadaj celok: ");
                double celok = scanner.nextDouble();
                System.out.print("Zadaj percentá: ");
                double percenta = scanner.nextDouble();
                double vysledok = vypocetPercent(celok, percenta);
                System.out.println("Výsledok: " + vysledok + "%");
            }
            public static double vypocetPercent(double celok, double percenta) {
                return (celok * percenta) / 100;
            }
        }