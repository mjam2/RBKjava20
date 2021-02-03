package plugginforprov;

import java.util.Scanner;

public class kapitel7_9 {
    public static void main(String[] args) {
        //skriver ut det minsta talet med hälp av vilkorsoperator
        Scanner input = new Scanner(System.in);
        System.out.print("Mata in två tal: ");
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        int max = tal1>tal2 ? tal1:tal2;
        System.out.println("Det största talet är: "+max);
    }
}
