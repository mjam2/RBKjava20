package kapitel4;

import java.util.Scanner;

public class övning4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in antal månader; ange hela tal: ");

        int månader = input.nextInt();
        int år = månader/12;
        int månad = månader%12;



        System.out.println("Det blir "+år+" år "+"och "+månad+" månader.");

    }
}
