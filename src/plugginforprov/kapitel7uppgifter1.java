package plugginforprov;

import java.util.Scanner;

public class kapitel7uppgifter1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("vilken uppgift ska vi köra?");
        int val = input.nextInt();
        /*switch (val) {
            case 1:
                System.out.println("Vart ska du?");
                String val = input.nextLine();
                System.out.println("Ok fortsätt " + (val.equals("höger") ? "höger ut." : "rakt fram."));
            case 2:
                System.out.println("Avstånd till jobbet?");
                int avstånd = input.nextInt();
                System.out.println("ska du bo ensam eller med någon?");
                String bor = input.nextLine();
                int år;
                int år2 = input.nextInt();
                if (bor.equals("ensam")) {
                    System.out.println("Hur länge har du tänkt bo ensam?");
                    år = input.nextInt();
                } else {
                    System.out.println("Hur länge har du tänkt bo tillsammans?");
                }
                if (avstånd > 50 && år < 1 && år2<3){
                    System.out.println();
                }

        }*/
    }
}
