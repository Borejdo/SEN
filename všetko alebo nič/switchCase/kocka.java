package switchCase;
import java.util.Random;

public class kocka {
    public static void main(String[] args) {
        Random random = new Random();

        int nula = 0;
        int jedna = 1;
        int dva = 2;
        int tri = 3;
        int styri = 4;
        int pat = 5;
        int sest = 6;

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(7);

            switch (randomNumber) {
                case 0:
                    nula++;
                    break;
                case 1:
                    jedna++;
                    break;
                case 2:
                    dva++;
                    break;
                case 3:
                    tri++;
                    break;
                case 4:
                    styri++;
                    break;
                case 5:
                    pat++;
                    break;
                case 6:
                    sest++;
                    break;
            }
        }

        System.out.println("Počet výskytov čísla 0: " + nula + ((double) 100 * nula) / 1000 + "%");
        System.out.println("Počet výskytov čísla 1: " + jedna + ((double) 100 * jedna) / 1000 + "%");
        System.out.println("Počet výskytov čísla 2: " + dva + ((double) 100 * dva) / 1000 + "%");
        System.out.println("Počet výskytov čísla 3: " + tri + ((double) 100 * tri) / 1000 + "%");
        System.out.println("Počet výskytov čísla 4: " + styri + ((double) 100 * styri) / 1000 + "%");
        System.out.println("Počet výskytov čísla 5: " + pat + ((double) 100 * pat) / 1000 + "%");
        System.out.println("Počet výskytov čísla 6: " + sest + ((double) 100 * sest) / 1000 + "%");
    }
}
