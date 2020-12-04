import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PROV_KAPITEL1_8_MELCHISEDEK_ADOMAKO_MINTAH_KOMPLETTERING_KRÄVS {
    /*
    Åtgärda så att antal bokstäver i namnen blir rätt.
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Namn?");        //frågar efter namn
        String namn = input.nextLine();
        System.out.println("Ålder");        //frågar efter ålder
        int ålder = Integer.valueOf(input.nextLine());
        System.out.println("Ange antal kompisar som ska skrivas in");
        String[] kompisar = new String[Integer.parseInt(input.nextLine())];

        //börjar loop som frågar efter 3 kompisars namn
        for (int i = 0; i < kompisar.length; i++) {
            System.out.println("Kompis" + (i + 1));
            kompisar[i] = input.nextLine();
        }

        System.out.println("Halva ditt namn är " + namn.substring(0, namn.length() / 2)); //skriver ut halva ditt namn
        System.out.print("Du har levt  " + (ålder * 365) + " dagar sedan du föddes.");
        //kollar om personen är 18 eller inte
        if (ålder > 17) {
            System.out.println(" Du är vuxen");
        } else {
            System.out.println(" Du är ett barn");
        }



        System.out.println("Dina kompisars namn består av totalt "+ (kompisar[0].length()+kompisar[1].length()+kompisar[2].length())+ " bokstäver."); //skriver ut antal bokstäver i kompisarnas namn

        System.out.println("Dina kompisar är" + Arrays.toString(kompisar).toUpperCase()); //skriver ut deras namn i versaler från fältet

        for (int i = 20; i > 0; i--) { //skriver ut allt från 20-1
            System.out.print(i + " ");
        }


    }
}
