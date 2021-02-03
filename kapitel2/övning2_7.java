import java.util.Scanner;

public class övning2_7 {
    public static void main(String[] args) {
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Skriv in ett tecken");
        String Teckenet = minScanner.nextLine();
        char Tecken = Teckenet.charAt(0);
        int  Tecken2 = (int)Tecken;

        System.out.println("Teckenet "+Teckenet+" har teckenkoden "+ Tecken2);
    }

}
