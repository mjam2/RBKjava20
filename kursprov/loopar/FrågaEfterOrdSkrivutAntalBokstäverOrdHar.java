package kursprov.loopar;

import java.util.Scanner;

public class FrågaEfterOrdSkrivutAntalBokstäverOrdHar {
    public static void main(String[] args) {

        //fråga användaren edter ord och tecken
        Scanner scan = new Scanner(System.in);
        System.out.println("mata in ditt ord");
        String a = scan.nextLine();
        System.out.println("skriv in ditt tecken");
        char tecken = scan.nextLine().charAt(0);
        int antal = 0;
        //lopa igenom ordet för att hitta tecknet


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == tecken) {
                antal++;
            }
        }
        System.out.println("Det finns "+antal+"st i "+a);
    }

}
