package plugginforprov;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        //enkel miniräknare program med hjälp av switch case
        /*switch (heltalsutrryck){
            case konstant 1_:
                satser_1
                break;
            case konstant 2_:
                satser_1
                break;
            .
            .
            .
            default: //friviligt och används/utförs om inga likheter har påträffats alltså inget matchar med case:n
                satser
        } */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange tal 1: ");
        double tal1 = scan.nextDouble();
        System.out.println("Ange räknesätt (1=+,2=-,3=*,4=/): ");
        int räknesätt = scan.nextInt();
        System.out.println("Ange tal 2: ");
        double tal2 = scan.nextDouble();
        switch (räknesätt){
            case 1:
            System.out.println("Svar: "+(tal1+tal2));
            break;
            case 2:
            System.out.println("Svar: "+(tal1-tal2));
            break;
            case 3:
            System.out.println("Svar: "+(tal1*tal2));
            break;
            case 4:
                System.out.println("Svar: "+(tal1/tal2));
                 break;
            default:
                System.out.println("Felinmatning");
        }
    }

}
