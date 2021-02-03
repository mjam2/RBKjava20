package kursprov.metoder;

import java.util.Scanner;

public class BooleanSiffra {
    public static void main(String[] args) {
        /*1. Skriv in char
         * 2. Använder boolean för att se om det är en siffra eller char
         * 3. Retunera värde till main metod.
         * 4. Skriv ut*/
        System.out.println("Mata in ett tecken");
        Scanner scan = new Scanner(System.in);
        char tecken = scan.nextLine().charAt(0);
        int teckental = Integer.valueOf(tecken);
        if (ärSiffra(teckental) >= 48 && ärSiffra(teckental)<= 57) {
            System.out.println(tecken + " är ett tecken");
        } else {
            System.out.println(tecken + " är en siffra");
        }
    }

    public static int ärSiffra(int teckentalN) {
        if (teckentalN >= 48 && teckentalN<= 57) {
            teckentalN = 1;
        } else {
            teckentalN = 0;

        }
        return teckentalN;
    }
}
