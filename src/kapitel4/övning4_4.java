package kapitel4;

import java.util.Scanner;

public class övning4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in ett hel tal");
        int tala = input.nextInt();
        int talb = tala--;
        int talc = --tala;



        System.out.println("Talet blir "+talb+" med (tal --)");
        System.out.println("Talet blir "+talc+" med (--tall)");

    }
}
