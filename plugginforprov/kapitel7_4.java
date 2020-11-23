package plugginforprov;

import java.util.Scanner;

public class kapitel7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        double ålder = input.nextDouble();

        if (ålder< 15 || ålder > 65){
            System.out.println("Det kommer kosta dig 5kr");
        }
        else{
            System.out.println("Det kommer kosta dig 10kr");
        }
    }
}
