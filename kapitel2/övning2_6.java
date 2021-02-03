package kapitel2;

import java.util.Scanner;

public class övning2_6 {
    public static void main(String[] args) {
        System.out.println("ÖVNING 2.6");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange namn:");
        String namn = minScanner.nextLine();

        // Beräkning och utskrift:
        int mellanslag = namn.indexOf(' ');
        String förnamn = namn.substring(0,mellanslag);
        String efternamn = namn.substring(mellanslag+1,namn.length());

        //Utskrift
        System.out.println("Förnamn: "+förnamn);
        System.out.println("Efternamn: "+efternamn);


    }
}