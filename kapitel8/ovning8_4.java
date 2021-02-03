package kapitel8;

import java.util.Scanner;

public class ovning8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antal värden");
        int värde = input.nextInt();
        int[] antal = new int[värde];

        for (int n = 0; n < värde; n++){
            System.out.println("Ange tal " + n + ": ");
            antal[n] = input.nextInt();
        }
        int min = antal[0];
        for (int n = 0; n < värde; n++ ){
            if (min>antal[n]) min=antal[n];
        }
        System.out.println(" ");
        System.out.println("minsta värdet är "+min);


    }
}
