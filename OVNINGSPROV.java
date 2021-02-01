import java.util.Arrays;
import java.util.Scanner;

public class OVNINGSPROV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många klubbar vill du mata in?");
        String[] KlubAntal = new String[Integer.valueOf(scan.nextLine())];
        System.out.println("Mata in namnen och årtalen av alla "+KlubAntal.length+" klubbar");
        System.out.println();
        int[] Klubår = new int[KlubAntal.length];

        for (int i = 0; i<KlubAntal.length;i++){
            System.out.println("Vad heter klubb "+(i+1));
            KlubAntal[i]=scan.nextLine();
            System.out.println("Vilket år grundades klubb "+(i+1));
            Klubår[i]=Integer.valueOf(scan.nextLine());
        }
        System.out.println("Vilket år ska det vara äldre än?");
        int begränsningsår=Integer.valueOf(scan.nextLine());
        System.out.println("Vilket tecken ska vi söka efter?");
        char tecken = scan.nextLine().charAt(0);

        System.out.println("Skriver ut alla klubbar som är äldre än "+begränsningsår+" år:");
        for (int n =0; n<KlubAntal.length;n++){
           if (Klubår[n]<begränsningsår && KlubAntal[n].contains(""+tecken)){
               System.out.print(KlubAntal[n]+",");
           }
        }
        System.out.println();
        System.out.println("Klubbar i storleksordning:");
        String äldstaklubben = KlubAntal[0];
        int Åräldstaklubben = Klubår[0];

        for (int j=0; j<KlubAntal.length;j++){
            if (Klubår[j]>Åräldstaklubben){
               äldstaklubben=KlubAntal[j];
                Åräldstaklubben=Klubår[j];
            }
            System.out.print(äldstaklubben+"\n");
        }


    }

}

