package palindrom;
import java.util.Scanner;
public class Help {
    Scanner sc = new Scanner(System.in);
    String reversSlovo = "";

    public void zistiPalindrom() {
        String original = ziskajSlovo();//toto je hlavná funkcia
        String otoceneSlovo = otocSlovo(original);

        if (original.equals(otoceneSlovo)) {
            System.out.println("Slovo: " + original + " je palindrom");
        }else {
            System.out.println("Slovo: " + original + " nie je palindrom");
        }
    }
            private String ziskajSlovo() {
                System.out.println("Ziskaj Slovo");
                return sc.nextLine().toLowerCase();
            }
            private String otocSlovo(String slovo) {
                for (int i = slovo.length() - 1; i >= 0; i--)
                    reversSlovo += slovo.charAt(i);
                {
                    return reversSlovo;
                }
            }
    }