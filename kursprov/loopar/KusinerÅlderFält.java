package kursprov.loopar;

import java.util.Arrays;
import java.util.Scanner;

public class KusinerÅlderFält {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många kusiner har du?");
        int [] kusiner = new int[Integer.valueOf(scan.nextLine())];

        for (int n = 0; n<kusiner.length;n++){
            System.out.println("Hur gammal är kusin "+(n+1)+"?");
            kusiner[n] = Integer.valueOf(scan.nextLine());
        }
        int antalkusiner=0;
        for (int i = 0; i< kusiner.length;i++){
           antalkusiner+=kusiner[i];
           // i en metod använd "return antalkusiner;"
        }

        System.out.println("Sammanlagda ålder av dina "+kusiner.length+" kusiner är "+antalkusiner);
    }
}
