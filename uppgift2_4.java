import java.util.Scanner;

public class uppgift2_4 {
    public static void main(String[] args) {
        Scanner tal = new Scanner(System.in);
        System.out.println("Mata in ett tal.");
        String talet = tal.nextLine();
        int talkod = Integer.valueOf(talet);
        char talkodet = (char)talkod;
        System.out.println(talet+(" representerar tecknet: ")+talkodet);
    }
}
