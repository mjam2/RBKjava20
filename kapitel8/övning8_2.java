package kapitel8;

import java.util.Scanner;

public class övning8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, slut, steg;
        System.out.println( "Start: " ); start = input.nextInt();
        System.out.println( "Slut: " ); slut = input.nextInt();
        System.out.println( "Steg: " ); steg = input.nextInt();
        for( int i=slut ; i >=start ; i -= steg)
        {
            System.out.println(i + " ");
        }
    }
}
