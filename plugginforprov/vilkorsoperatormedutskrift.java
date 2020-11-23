package plugginforprov;

import java.util.Scanner;

public class vilkorsoperatormedutskrift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur många bilar har du? ");
        int antal = input.nextInt();
        System.out.println(" Du angav "+antal+(antal == 1 ? " bil.":" bilar."));
    }
}
