package plugginforprov;

import java.util.Scanner;

public class kapitel7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in ett namn");
        String namn1 = input.nextLine();
        System.out.println(" Skriv in ett till namn");
        String namn2 = input.nextLine();
        System.out.println(" I bokstavsordning");
        if (namn1.compareToIgnoreCase(namn2)<0){
            System.out.println(namn1);
            System.out.println(namn2);
        }
        else{
            System.out.println(namn2);
            System.out.println(namn1);
        }
//basically .compareto return 0 om det är identisk, negativt tal om första är större än andra stränge
        // positivt tal om det andra strängen är större.
    }
}
