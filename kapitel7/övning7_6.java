package kapitel7;

import java.util.Scanner;

public class övning7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antal skivor du vill köpa?");
        int skivor = input.nextInt();
        double pris;
        if (skivor >= 10){
            pris = 9.90*skivor*0.95;
            System.out.println(pris);
        }
        else if (skivor <= 10){
            pris = 9.90*skivor;
            System.out.println(pris);
        }
        else if (skivor >=50){
            pris = 9.90*skivor*0.9;
            System.out.println(pris);
        }
        else{
            pris = 9.90*skivor*0.85;
            System.out.println(pris);
        }

    }
}
