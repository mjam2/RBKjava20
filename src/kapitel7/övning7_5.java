package kapitel7;

import java.util.Scanner;

public class övning7_5 {
    private static Object vind;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in längden av ditt hopp");
        double längd = input.nextDouble();
        if (längd>7.92){
            System.out.println("vindstryka vid hopp?");
            double vind = input.nextDouble();
            if (vind<=2){
                System.out.println("grattis");
            }
            else{
                System.out.println("tyvärr");
            }
        }
        else{
            System.out.println("tyvärr");
        }
    }
}