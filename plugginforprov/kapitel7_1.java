package plugginforprov;

import java.util.Scanner;

public class kapitel7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in ditt ålder ");

        int ålder = input.nextInt();

        if (ålder<13){
            System.out.println("Du får ej delta i detta tävling");
        }
        else{
            System.out.println("Du får delta");
        }
    }
}
