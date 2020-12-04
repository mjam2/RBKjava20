package plugginforprov;

import java.util.Scanner;

public class kapitel7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange kön");
        String kön = input.nextLine();
        System.out.println("Du är en"+(kön.equals("man")? " man.": " kvinna."));
    }
}
