package kapitel2;

import java.util.Scanner;

public class övning2_2 {
    public static void main(String[] args) {
        System.out.println("Ange ett hel tal:");
        Scanner input = new Scanner( System.in );
        int tal = input.nextInt();
        System.out.println("Kvadraten av ditt tal är: " + tal*tal);
    }
}
