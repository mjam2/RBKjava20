package plugginforprov;

import java.util.Scanner;

public class kapitel7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur högt hoppar du?");
        double höjd = input.nextDouble();
        System.out.println("Vindstryka?");
        double vind = input.nextDouble();

        if (höjd>7.92 && vind<2.0){
            System.out.println("Grattis");
        }
        else{
            System.out.println("testa igen");
        }
    }
}
