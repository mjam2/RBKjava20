package kapitel6;

import java.util.Scanner;

public class övningar {
    public static void main(String[] args) {
        övning6_1();
        //övning6_2();
        //övning6_3();






    }

    private static void övning6_3() {
        //
    }

    private static void övning6_2() {
        //läs in timmar
        //läs in minuter
        //läs in sekunder
        //beräkna totala sekunder
        //skriv ut svaret
    }

    private static void övning6_1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in tre hel tal");
        int [] talen = {input.nextInt(),input.nextInt(),input.nextInt()};
        talen[0] *= 2;
        talen[1] *= 3;
        talen[2] *= 4;

        int summa = talen[0]+talen[1]+talen[2];

        System.out.println(summa);

    }

}
