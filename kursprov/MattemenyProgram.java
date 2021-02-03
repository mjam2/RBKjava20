package kursprov;

import java.util.Scanner;

public class MattemenyProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("[G]  Geometri\n" + "[A]  Algebra\n" + "[D]  Derivator\n" + "[S]  Statistik\n" + "[P]  Primtal\n");
        char menyswitch = scan.nextLine().charAt(0);


        switch (menyswitch) {
            case 'G':
                System.out.println("Vad vill du beräkna?");
                System.out.println();
                System.out.println("Volym [V]");
                System.out.println("Area [A]");
                char volymswitch = scan.nextLine().charAt(0);
                switch (volymswitch){
                    case 'V':
                        System.out.println("Vad vill du göra?\n"+"[C] Cylinder\n" + "[R] Rätblock\n" + "[S] Sfär\n");
                }

                break;
            case 'A':
                System.out.println("Vad vill du beräkna?");
                System.out.println();
                System.out.println("Volym [V]");
                System.out.println("Area [A]");
                break;
            case 'D':
                System.out.println("Vad vill du beräkna?");
                System.out.println();
                System.out.println("Volym [V]");
                System.out.println("Area [A]");

                break;
            case 'S':
                System.out.println("Vad vill du beräkna?");
                System.out.println();
                System.out.println("Volym [V]");
                System.out.println("Area [A]");
                break;
            case 'P':
                System.out.println("Vad vill du beräkna?");
                System.out.println();
                System.out.println("Volym [V]");
                System.out.println("Area [A]");
                break;
            default:
                System.out.println("Används ifall valet inte matchade något av alternativen. Reserutväg");
        }
    }
}
