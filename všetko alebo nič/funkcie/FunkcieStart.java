package funkcie;
import java.util.Scanner;

public class FunkcieStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sucet = sucetDvochCisiel();
        System.out.println(sucet);
        System.out.println(sucetDvochCisiel());
pozdrav();

System.out.println("Zadaj cislo pre vypocet druhej mocniny ");
int druhaMocninaPremenna= druhaMocnina(sc.nextInt());
System.out.println(druhaMocninaPremenna);
    }

public static void  pozdrav(){
        System.out.println("Ahoj pozdravujem ťa");
    }

    public static int sucetDvochCisiel() {
        return 200 + 900;
    }

    public static int druhaMocnina(int a) {
        return a*a;
    }
    }