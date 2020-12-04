package kapitel8;

import java.util.Scanner;

public class UPPGIFTER_LOOPAR {
    public static void main(String[] args) {
        System.out.println("Mata in 4 olika tecken");
        Scanner input = new Scanner(System.in);
        char t = input.nextLine().charAt(0);
        char[] tecken = new char[t];

        for (int n = 0; n <= t; n++) {
            System.out.println("Ange tal "+n+": ");
            tecken[n] = input.nextLine().charAt(0);

        }

    }
}
