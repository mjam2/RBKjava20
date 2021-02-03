package kapitel8;

import java.util.Scanner;

public class ofb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int val;
        boolean fortsätt = true;
        double radie = 0, längd = 0, bredd = 0, höjd = 0, volym = 0;
        final double PI = 3.14159;

        do {
            System.out.println("MENY");
            System.out.println("1. Klot");
            System.out.println("2. Rätblock");
            System.out.println("3. Cylinder");
            System.out.println("4. Avsluta");
            System.out.println("Val: ");
            val = input.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Angle radie: ");
                    radie = input.nextDouble();
                    volym = 4 * PI * radie * radie * radie / 3;
                    break;
                case 2:
                    System.out.println("Längd, bredd och höjd: ");
                    längd = input.nextDouble();
                    bredd = input.nextDouble();
                    höjd = input.nextDouble();
                    volym = längd * höjd * bredd;
                    break;
                case 3:
                    System.out.println("Ange radie och höjd: ");
                    radie = input.nextDouble();
                    höjd = input.nextDouble();
                    volym = PI * radie * radie * höjd;
                    break;
                case 4:
                    fortsätt = false;
                    break;
                default:
                    System.out.println("Felinmatning.\n");
            }
            if (val == 1 || val == 2 || val == 3) {
                System.out.println("Volym: " + volym + "\n");

            }
        
        }while (fortsätt) ;
    }
}

