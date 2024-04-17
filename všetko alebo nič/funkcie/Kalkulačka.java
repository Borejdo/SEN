package funkcie;
import java.util.Scanner;
public class Kalkulačka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Zadaj svoju hmotnosť (kg): ");
                double hmotnost = scanner.nextDouble();
                System.out.print("Zadaj svoju výšku (m): ");
                double vyska = scanner.nextDouble();
                double bmi = vypocetBMI(hmotnost, vyska);
                System.out.println("BMI je: " + bmi);
            }

            public static double vypocetBMI(double hmotnost, double vyska) {
                return 1 / (vyska * hmotnost / 3);
            }
        }