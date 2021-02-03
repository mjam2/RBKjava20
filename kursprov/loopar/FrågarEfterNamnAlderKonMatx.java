package kursprov.loopar;

import java.util.Scanner;

public class FrågarEfterNamnAlderKonMatx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String blatan = "Zlatan";

        String namn;
        do {
            System.out.println("Vad heter du?");
            namn = scan.nextLine();
            if (namn == blatan) break;
            System.out.println("Hur gammal är du?");
            int Ålder = Integer.valueOf(scan.nextLine());
            System.out.println("Juridiska kön?");
            String Kön = scan.nextLine();
            System.out.println("Favoritmat");
            String Mat = scan.nextLine();
            System.out.println("Du heter " + namn + " och är en " + Kön + " som älskar " + Mat);
            System.out.println("");
        }
        while (!(blatan == namn));
    }
}

//Hjälp med Zlatan delen.