package kursprov.metoder;

import java.util.Scanner;
/* Detta kan användas istället för if else sats.

 */
public class SwitchCaseExempel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken method vill du köra?");
        System.out.println("1 = antal Ord");
        System.out.println("2 = potenser");
        int menyswitch = Integer.valueOf(scan.nextLine());


        switch (menyswitch){
            case 1:
                System.out.println("Code goes here lol");
                break;
            case 2:
                System.out.println("Code could also go here");
                break;
            default:
                System.out.println("Används ifall valet inte matchade något av alternativen. Reserutväg");
        }
    }
}
