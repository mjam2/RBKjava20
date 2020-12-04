package prov;

import java.util.Scanner;

public class PROV_KAP1_4_MELCHISEDEK_ADOMAKO_RÄTTAD {

    /*
    Bedömning från Joakim:
    Bra jobbat Melchi!
    Du har mycket bra med kommentarer, kanske lite FÖR detaljerade faktiskt ;)

    Du löser de fyra första uppgifterna bra.
    Tänk dock på att du inte behöver flera Scanner-objekt, du kan använda en och samma hela tiden.

    Du gör en bra ansats till lösning av sista uppgiften men du hinner inte klart. -1p.

    Poäng: 11 av 12
    Betyg: E
     */

    public static void main(String[] args) {
        Scanner namn = new Scanner(System.in); // Används för att mata in namnet

        System.out.println("Vad heter du? Vänligen mata in ditt namn");
        String name = namn.nextLine(); // Omvandlar input från tagentbordet till en sträng som går att läsa

        System.out.println("Du heter " + name.toUpperCase() + " och ditt namn består av " + name.length() + " bokstäver"); //Skriver ut antal tecken i användarens och i versaler.






        System.out.println("Skriv in ett heltal"); // Skriver ut texten som ber användare skriva in ett tal
        Scanner heltalA = new Scanner(System.in); //  Tar från tagentbordet det användare har matat in
        int heltalenA = heltalA.nextInt(); // omvandlar input till en int

        System.out.println("Skriv in ett till heltal"); // Skriver ut texten som ber användare skriva in ett till tal
        Scanner heltalB = new Scanner(System.in);  //  Tar från tagentbordet det användare har matat in
        int heltalenB = heltalB.nextInt(); // omvandlar input till en int

        int summa = heltalenA + heltalenB; // adderar heltalen
        int produkt = heltalenA * heltalenB; // multiplicerar heltalen
        int modulo = heltalenB % heltalenA; // använder sig av modulo för att få resten.

        System.out.println("Summan av " + heltalenA + " och " + heltalenB + " är " + summa);
        System.out.println("Produkten av " + heltalenA + " och " + heltalenB + " är " + produkt);
        System.out.println("När " + heltalenA + " divideras med " + heltalenB + " blir resten " + modulo);




        System.out.println("Skriv in 4 frukter"); // skriver ut det användaren ska göra
        Scanner frukt = new Scanner(System.in); // användar input för frukterna

        String[] frukter = {frukt.nextLine(), frukt.nextLine(), frukt.nextLine(), frukt.nextLine()}; // Sparar frukterna i en fält som består av 4 frukter
        System.out.println("Alla frukter i fältet:"); // Skriver ut det som står i parantesen.

        System.out.println(frukter[0]); // skriver ut frukten i index 0 av fälten frukter
        System.out.println(frukter[1]); // skriver ut frukten i index 1 av fälten frukter
        System.out.println(frukter[2]); // skriver ut frukten i index 2 av fälten frukter
        System.out.println(frukter[3]); // skriver ut frukten i index 3 av fälten frukter


        System.out.println("Alla värden i fältet efter ändringarna: ");  // Skriver ut det som står i parantesen.
        String temp = frukter[0]; // skapar temporär fält som används för att byta plats
        frukter[0] = frukter[3]; // frukter0 får värder 3
        frukter[3] = temp; // frukter 3 från temp värder
        frukter[1] = "KIWI"; // får kiwi som det nya värdet
        frukter[2] = name.substring(0,name.length()/2); // tar halva namnet genom att ta hälften av det hela namnet

        System.out.println(frukter[0]); // skriver ut frukten i index 0 av fälten frukter
        System.out.println(frukter[1]); // skriver ut frukten i index 1 av fälten frukter
        System.out.println(frukter[2]); // skriver ut frukten i index 2 av fälten frukter
        System.out.println(frukter[3]); // skriver ut frukten i index 3 av fälten frukter

       // System.out.println("Skriv in ett fem-siffrigt binärt tal, Tack");
        //Scanner tal = new Scanner(System.in);
        // int[] talet = {tal.nextInt()};

       // talet[0] *= 16;
        //talet[1] *= 8;
        //talet[2] *= 4;
        // talet[3] *= 2;
        // talet[4] *= 1;

        //String basen10 = Integer.valueOf(talet[0])+Integer.valueOf(talet[1])+Integer.valueOf(talet[2])+Integer.valueOf(talet[3]+Integer.valueOf(talet[2]);

       //System.out.println(talet+" motsvarar "+basen10+" i basen 10 (decimalt)");

    }
}
