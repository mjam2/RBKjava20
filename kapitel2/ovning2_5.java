package kapitel2;
import java.util.Scanner;

public class ovning2_5 {
    public static void main(String[] args) {
        System.out.println("ÖVNING 2.5");
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Ange för- och efternamn:");
        String namn = minScanner.nextLine();
        char förstaInitialen = namn.charAt(0);          // Tar ut det första tecknet ur strängen
        int indexOfMellanslag = namn.indexOf(' ');     // Tar ut indexet för där mellanslaget är
        char andraInitialen = namn.charAt(indexOfMellanslag+1);
        System.out.println(namn+" har initialerna "+förstaInitialen+"."+andraInitialen);
    }
}