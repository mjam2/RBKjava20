package plugginforprov;

import java.util.Scanner;

public class kapitel7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENY");
        System.out.println("1. insättning");
        System.out.println("2. uttag");
        System.out.println("3. visa behålling");
        int val = input.nextInt();
        switch (val){
            case 1:
                System.out.println("Hur mycket vill du sätta in?");
                double insättning = input.nextDouble();
                System.out.println("Ditt nya belopp är: "+(insättning+1000)+("kr"));
                break;
            case 2:
                System.out.println("Hur mycket vill du ta?");
                double uttag = input.nextDouble();
                if (uttag>1000){
                    System.out.println("Du har inte tillräckligt på kontot!");
                }
                else{
                    System.out.println("Ditt nya belopp är: "+(1000-uttag)+("kr"));
                }
                break;
            case 3:
                System.out.println("Ditt belopp är: "+(1000)+("kr"));
                break;


        }
    }
}
