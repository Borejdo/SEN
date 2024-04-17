package PrikladyFuncke1;

import java.util.Scanner;

public class Help {
Scanner sc= new Scanner(System.in);
int parneNeparne;
public void pozdravenie() {
    System.out.println("Zadaj svoje meno");
    System.out.println("Pozdravujem ťa " + sc.nextLine());
}

public void vypocitajObsahKruhu(double r) {
    System.out.println(2 * 3.14 * r);
}

public void zistiCiJeCisloParne() {
    System.out.println("Zadaj mi párne číslo ");
    parneNeparne= sc.nextInt();

    if (parneNeparne % 2 ==0) {
        System.out.println("Číslo " + parneNeparne + " je párne ");
    }else {
        System.out.println("Číslo " + parneNeparne + " Nie je párne ");
    }
}
}
