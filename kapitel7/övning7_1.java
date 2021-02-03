package kapitel7;

import java.util.Scanner;

public class övning7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int ålder = input.nextInt();
        if (ålder > 12)
            System.out.println("Du får delta");
        else
            System.out.println("Du får inte delta");

    }
}
