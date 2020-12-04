import java.util.Scanner;

public class uppgift3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in 4 tal: ");
        int[] tal = new int[4];
        tal[0] = input.nextInt();
        tal[1] = input.nextInt();
        tal[2] = input.nextInt();
        tal[3] = input.nextInt();

        System.out.println(tal[0]+"\t"+tal[1]+"\t"+tal[2]+"\t"+tal[3]);

        int temp = tal[0];
        tal[0] = tal[3];
        tal[3] = temp;

        int temp2 = tal[1];
        tal[1] = tal[2];
        tal[2] = temp2;

        System.out.println(tal[0]+"\t"+tal[1]+"\t"+tal[2]+"\t"+tal[3]);
    }
}
