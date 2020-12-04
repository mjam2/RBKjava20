import java.util.Scanner;

public class övning3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mata in 3 heltal.");
        int[] heltal = new int[4];
        heltal[0] = input.nextInt();
        heltal[1] = input.nextInt();
        heltal[2] = input.nextInt();

        System.out.println("Innehåll i fältet vikt: "+heltal[0]+"\t"+heltal[1]+"\t"+heltal[2]);

        int temp = heltal[0];
        heltal[0] = heltal[2];
        heltal[2] = temp;

        System.out.println("Innehåll i fältet vikt: "+heltal[0]+"\t"+heltal[1]+"\t"+heltal[2]);
    }
}
