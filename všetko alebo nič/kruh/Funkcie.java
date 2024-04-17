package kruh;
import java.util.Scanner;
public class Funkcie {
Scanner sc=new Scanner(System.in);
double PI = Math.PI;

    public double ziskajPolomer() {
        System.out.println("Zadaj polomer");
        return sc.nextDouble();
    }
        public double vypocetObdovKruhu() {


            return 2 * PI * ziskajPolomer();
    }
        public double vypocetObsahuKruhu() {
        double r = ziskajPolomer();
            return PI * r * r;
    }
    public void vyberSluzbu() {
        System.out.println("Zadaj pre obvod -o- a pre obsah -s-");

        switch (sc.nextLine().charAt(0)) {
            case 's':
                System.out.println("Obsah kruhu: " + vypocetObsahuKruhu());
                break;

                case 'o':
                System.out.println("Obvod Kruhu: " + vypocetObdovKruhu());
                break;
            default:
                break;
        }
    }
}