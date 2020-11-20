package kapitel7;

import java.util.Scanner;

public class övning7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur mycket Etanol finns det i tanken?");
        double mängd = input.nextDouble();
        if(mängd>10)
            System.out.println("Du kan köra vidare");
        else
            System.out.println("Du borde tanka");
            System.out.print("Du kan fylla på för "+(50-mängd)+"L, ");
            System.out.println("Det kommer att kosta dig "+((50-mängd)*9.50)+" kr");


    }
}
