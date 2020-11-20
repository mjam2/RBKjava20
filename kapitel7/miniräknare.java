package kapitel7;

import java.util.Scanner;

public class miniräknare {
    public static void main(String[] args) {
       // miniräknare();
        miniräknare2();


    }

    private static void miniräknare() {
    /*
    Läs ut strängen "A operator b"
    Sug ut talet A ur strängen
    Sug ut talet b ur strängen
    Sug ut operator ur strängen
    Beräkna värdet av A operator B (baserat på operatorn)
    Skriva ut värdet
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in A operator B");
        String indata = input.nextLine();
        String[] splittad = indata.split(" ");
        int a = Integer.valueOf(splittad[0]);
        int b = Integer.valueOf(splittad[2]);
        String operator = splittad[1];
        if (operator.equals("+")){
            System.out.println(a+b);
        }
        else if (operator.equals("*")){
            System.out.println(a*b);
        }
        else if (operator.equals("-")){
            System.out.println(a-b);
        }
        else if (operator.equals("%")){
            System.out.println(a%b);
        }
        else{
            System.out.println("Jag uppfattade inte din operator.");
        }
    }
    private static void miniräknare2() {
    /*
    Läs ut strängen "A operator b"
    Sug ut talet A ur strängen
    Sug ut talet b ur strängen
    Sug ut operator ur strängen
    Beräkna värdet av A operator B (baserat på operatorn)
    Skriva ut värdet
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in A operator B");
        String indata = input.nextLine();
        String[] splittad = indata.split(" ");
        int a = Integer.valueOf(splittad[0]);
        int b = Integer.valueOf(splittad[2]);
        String operator = splittad[1];

        switch (operator){
            case"%":
            System.out.println(a%b);

            case "*":
            System.out.println(a*b);

            case "-":
                System.out.println(a-b);

            case "+":
                System.out.println(a+b);
        }

/*      if (operator.equals("+")){
        }
        else if (operator.equals("*")){
        }
        else if (operator.equals("-")){
        }
        else if (operator.equals("%")){
        }
        else{
  */        System.out.println("Jag uppfattade inte din operator.");
        }
    }


