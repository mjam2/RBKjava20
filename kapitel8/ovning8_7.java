package kapitel8;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ovning8_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Räknesätt?");
            //fråga efter räknesätt
            String räknesätt = input.nextLine();
            // fråga efter tal 1
            System.out.println("TAL1");
            int tal1 = Integer.valueOf(input.nextLine());

            // fråga efter tal2
            System.out.println("TAL2");
            int tal2 = Integer.valueOf(input.nextInt());

            System.out.println(tal1+" + "+tal2+" = "+(tal1+tal2));

            // köra igen?
            System.out.println("Köra igen?");
            String svar = input.nextLine();
            // om köra igen är NEJ:
            if(svar.equals("NEJ")){
                //bryt loopen
                break;
            }

        }


        // oändlig loop:
            //fråga efter räknesätt
            // fråga efter tal 1
            // fråga efter tal2
            // köra igen?
            // om köra igen är NEJ:
                    //bryt loopen

    }
}