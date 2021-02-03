package kapitel2;

import java.util.Scanner;

public class övningar {

    public static void main (String [] args) {
        övning2_1();

    }


    private static void övning2_1() {
        System.out.println("Här kommer övning 2.1:");
        // Skapar tre variabler
        double talA;
        double talB;
        double summa;

        // Tilldelar variablerna värden:
        talA = 2.1;
        talB = 3.1;
        summa = talA + talB;

        //Skriver ut text:
        System.out.println("TalA är " + talA);
        System.out.println("TalB är " + talB);
        System.out.println("Summan är " + summa);

    }
}
