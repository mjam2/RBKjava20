package kapitel7;

import java.util.Scanner;

public class övning7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int ålder = input.nextInt();
        if (ålder < 65 ||ålder > 65 ){
            System.out.println("Avgiften är 10kr");
        }
        else{
            System.out.println("Avgiften är 5kr");
        }
    }
}
