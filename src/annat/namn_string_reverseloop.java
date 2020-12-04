package annat;

import java.util.Scanner;

public class namn_string_reverseloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Namn?");
        String namn = input.nextLine();

        String namnBk = namnTBak(namn);
        System.out.println(namnBk);

        System.out.println("\t Eller:....");


        System.out.println(new StringBuilder(namn).reverse().toString());
        System.out.println(namn);
    }
    private static String namnTBak(String namn){
        String svar = "";
        for (int i = 0; i<= namn.length()-1; i++){
            svar+= namn.charAt(namn.length()-1-i);
        }
        return svar;

    }


}
