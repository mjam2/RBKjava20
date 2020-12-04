import java.util.Scanner;

public class övning3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in hel tal.");
        double[] tal = new double[4];
        tal[0] = input.nextDouble();
        tal[1] = input.nextDouble();
        tal[2] = input.nextDouble();
        tal[3] = input.nextDouble();
        System.out.println(tal[0]+"\t"+tal[1]+"\t"+tal[2]+"\t"+tal[3]);




    }
}