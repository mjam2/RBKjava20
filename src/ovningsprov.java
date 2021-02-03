import java.util.Scanner;

public class ovningsprov {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många klubbar finns det?");
        String[] Klubb = new String[Integer.valueOf(scan.nextLine().toUpperCase())];
        int[] År = new int[Klubb.length];

        for (int i= 0; i<Klubb.length;i++){
            System.out.println("Mata in namnet på klubb "+(i+1));
            Klubb[i] = scan.nextLine();
            System.out.println("Mata in vilket år klubben grundades");
            År[i]= Integer.valueOf(scan.nextLine());
        }

        System.out.println("Begränsnings år?");
        int begår= Integer.valueOf(scan.nextLine());
        System.out.println("Begränsnings Tecken?");
        char tecken = scan.nextLine().toUpperCase().charAt(0);

//kommenterar

        for (int n=0; n<Klubb.length;n++){
            if (År[n]>begår && Klubb[n].charAt(n)==tecken){
                    System.out.println(Klubb[n]+" är äldre än "+begår+" och innehåller tecknet "+tecken);
                }
            }
        }


}

