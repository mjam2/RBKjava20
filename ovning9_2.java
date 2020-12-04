package kapitel9;

import java.util.Scanner;

public class ovning9_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in cylinders radie.");

        double radie = Double.valueOf(scan.nextLine());
        double höjd = Double.valueOf(scan.nextLine());

        double arean = basAreaCylinder(radie);
        double volym = volymCylinder(höjd);

        System.out.println("Arean är "+arean);
        System.out.println("Volymen är "+volym);

    }
    private static double basAreaCylinder(double radie) {
        double area = radie * radie * Math.PI;
        return area;

    }
    private static double volymCylinder(double höjd, double radie){
        double volym = radie*radie*höjd*Math.PI;
        return volym;
    }
}
