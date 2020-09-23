import java.util.Scanner;

public class övning2_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange stor bokstav: ");
        String storbokstav = input.nextLine();
        char versal = storbokstav.charAt(0);
        int  kodversal = (int)versal;
        int litetbokstav = (kodversal+32);
        char lilb = (char)litetbokstav;
        System.out.println("Litet "+storbokstav+" blir "+lilb);

    }
}
