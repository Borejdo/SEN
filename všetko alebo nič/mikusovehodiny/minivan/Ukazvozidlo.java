package mikusovehodiny.minivan;

public class Ukazvozidlo {
public static void main(String[] args){
double dojazd;
Vozidlo minivan=new Vozidlo();

minivan.cestujúci=7;
minivan.objemnadrze=60;
minivan.litrena100km = 10;

dojazd = 100*(minivan.objemnadrze/ minivan.litrena100km);
System.out.println("Dojazd minivanu je :" + dojazd);

    }
}

