package plugginforprov;

import java.util.Scanner;

public class kapitel7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        double ålder = input.nextDouble();

        if (ålder> 14 && ålder < 66){
            System.out.println("Det kommer kosta dig 10kr");
        }
        else{
            System.out.println("Det kommer kosta dig 5kr");
        }
    }
}
