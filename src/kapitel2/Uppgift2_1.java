import java.util.Scanner;

public class Uppgift2_1 {
    public static void main(String[] args) {
        Scanner bas = new Scanner(System.in);
        System.out.println("Mata in triangels bas:");
        String basen = bas.nextLine();
        System.out.println("Mata in triangels höjd:");
        Scanner hojd = new Scanner(System.in);
        String hojden = hojd.nextLine();
        int area = Integer.valueOf(hojden)*Integer.valueOf(basen);
        System.out.println("Triangels area är "+area);

    }
}
