package kapitel1; // Den här raden berättar att denna Java-klass ligger i ett package med namnet kapitel1

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Uppgifter {  // Här börjar Java-klassen Uppgifter. Klassnamnet måste vara samma som filnamnet.

    public static void main(String[] args) {  // Detta är main-metoden. Här börjar programmet köra om kompileringen går igenom.
        uppgift1();  // Anrop till metoden uppgift1
        uppgift2();  // Anrop till metoden uppgift2
        uppgift3();  // Detta anrop är bortkommenterat så att koden ignorerar det.
        uppgift4(); // Också bortkommenterat, ta bort kommentaren om du vill att koden ska anropa uppgift4.
    }

    static void uppgift1() {
        System.out.println("Melchisedek Adomako Mintah"); // En rad som skriver ut mitt namn
        System.out.println("Bagartorpsringen 62");   // En annan rad som skriver ut min adress
        System.out.println("170 69 Solna"); // Mitt postnummer
    }

    static void uppgift2() {
        // TODO: Fixa en blankrad mellan namn och adress...
        System.out.println("Melchisedek Adomako Mintah");
        System.out.println();
        System.out.println("Bagartorpsringen 62");
        System.out.println("170 69 Solna");
    }

    static void uppgift3() {
        System.out.println("JJJJJ    JJJ    J    J    JJJ");
        System.out.println("    J   J   J   J    J   J   J");
        System.out.println("    J   J   J     J J    J   J");
        System.out.println("J   J   JJJJJ     J J    JJJJJ");
        System.out.println(" JJJ    J   J      J     J   J");
        System.out.println("");
        System.out.println("");
    }

    static void uppgift4() {
        System.out.println("  \" \" \"");
        System.out.println("\\ \\  / /");
        System.out.println("  o  o");
        System.out.println("    U");
        System.out.println("   __");
    }

} // Denna "måsvinge" stänger hela klassen "Uppgifter"