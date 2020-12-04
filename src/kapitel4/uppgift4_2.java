package kapitel4;

import java.util.Scanner;

public class uppgift4_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in ett heltal");
        int tal1 = Integer.valueOf(input.nextLine());
        int tal=tal1;
        tal*=2;
        tal-=6;
        tal/=2;
        tal+=3;
        tal-= tal1;

        System.out.println(tal1);



    }
}
