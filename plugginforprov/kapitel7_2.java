package plugginforprov;

import java.util.Scanner;

public class kapitel7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur mycket etanol har du kvar?");
        double tank = input.nextInt();

        if (tank>10){
            System.out.println("Kör vidare");
        }
        else{
            System.out.print("Du borde tanka! ");
            System.out.println("Du borde fylla på "+(50-tank)+" litre");
            System.out.println("Det kommer att kosta dig: "+((50-tank)*9.50)+"kr");
        }
    }
}
