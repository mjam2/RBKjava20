package kapitel4;

import java.util.Scanner;

public class övning4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tal1, tal2;

        System.out.println("Mata in två heltal: ");
        tal1 = scan.nextDouble();
        tal2 = scan.nextDouble();
        System.out.println(tal1 + "/" + tal2 + " = " + tal1/tal2);
        System.out.println(tal1 + "%" + tal2 + " = " + tal1%tal2);

// Det som händer är att modulus blir fortfarande samma sak men det andra visar decimaler.
    }
}
