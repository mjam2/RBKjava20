package kursprov.metoder;

import java.util.Scanner;

public class gemen {
    public static void main(String[] args) {
        System.out.println("Mata in en gemen");
        Scanner scan = new Scanner(System.in);
        char gemen = scan.nextLine().charAt(0);
        char versal = Character.toUpperCase(gemen);
        System.out.println(gemen+" i versal är "+versal);


    }
}


/* 1. Skriv en metod som tar en gemen som parameter och som returnerar motsvarande versal.
Testa att din metod fungerar som tänkt genom att anropa den från en main-metod.
 */