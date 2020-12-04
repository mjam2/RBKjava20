import java.util.Scanner;

public class uppgift3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in 3 decimala tal: ");
        double[] tal = new double[3];
        tal[0] = input.nextDouble();
        tal[1] = input.nextDouble();
        tal[2] = input.nextDouble();

        double summa = tal[0]+tal[1]+tal[2];
        double medelvarde= (tal[0]+tal[1]+tal[2])/2;
        System.out.println("Summan av alla decimala tal är: "+summa);
        System.out.println("Medelvärde: "+medelvarde);

    }

}
