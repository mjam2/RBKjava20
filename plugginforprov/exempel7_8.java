package plugginforprov;

import java.util.Scanner;

public class exempel7_8 {
    public static void main(String[] args) {
        //jämför string
        Scanner scan = new Scanner(System.in);
        System.out.print("Användarnam:");
        String namn = scan.nextLine();
        System.out.print("Lösenord: ");
        String lösen = scan.nextLine();
        if (namn.equals("Mia") && lösen.equals("hemligt")){
            System.out.println("\nHej Mia");

        }
        else{
            System.out.println("\nFelaktigt namn eller lösenord");
        }
    }
}
