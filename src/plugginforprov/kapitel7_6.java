package plugginforprov;

import java.util.Scanner;
//frågar efter hur många skivor du vill ha
public class kapitel7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skivor?");
        int skivor = input.nextInt();
        double pris;
        if (skivor>10){
            System.out.println("Priset för "+skivor+" blir "+((skivor*9.90)*0.95)+"kr");
        }
        else if (skivor>50){
            System.out.println("Priset för "+skivor+" blir "+((skivor*9.90)*0.90)+"kr");
        }
        else if (skivor>100){
            System.out.println("Priset för "+skivor+" blir "+((skivor*9.90)*0.85)+"kr");
        }
        else{
            System.out.println(skivor*9.90+"kr");
    }
}
}