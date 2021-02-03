package kursprov.metoder;

import java.util.Scanner;

public class antaletOrd {
    public static void main(String[] args) {
/* Läs in mening
* Räkna antal ord i en seperat metod
* Kom tillbaka till main metoden och skriv ut svaret.*/

        System.out.println("Skriv in en mening");
        Scanner scan = new Scanner(System.in);
        String mening = scan.nextLine();
        System.out.println("Antal ord i meningen är "+Antalordanrop(mening));

    }
    public static int Antalordanrop(String mening) {
        if (mening == null || mening.isEmpty()) {
            return 0;
        }

        String[] words = mening.split("\\s+");
        return words.length;
    }

}
 /*Skriv en metod med signaturen int antalOrd (string text) som tar in
 en sträng och returnerar antal ord i strängen. Testa att din metod fungerar.
  */