import java.util.Scanner;

public class MethodLayout {
    public static void main(String[] args) {
        /*
        Skriv en metod som tar en gemen som parameter och som returnerar motsvarande versal.
        Testa att din metod fungerar som tänkt genom att anropa den från en main-metod.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mata in gemenen som du vill omvandla till en versal");

        char gemen = scan.nextLine().charAt(0);

        gemenTillversal(gemen);

        System.out.println(gemen+" -> "+gemenTillversal(gemen));

    }

    public static char gemenTillversal(char gemen) {
        char versal = Character.toUpperCase(gemen);
        return versal;
    }
}
