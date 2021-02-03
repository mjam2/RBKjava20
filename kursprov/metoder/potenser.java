package kursprov.metoder;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class potenser {
    public static void main(String[] args) {
        System.out.println("Mata in ett bas nummer");
        Scanner scan = new Scanner(System.in);
        int bas = Integer.valueOf(scan.nextLine());
        System.out.println("Mata in en exponent");
        int exponent = Integer.valueOf(scan.nextLine());
        int svar = (int) Math.pow(bas,exponent);
        System.out.println(bas+" upphöjt till "+exponent+" blir "+svar);
    }
}
