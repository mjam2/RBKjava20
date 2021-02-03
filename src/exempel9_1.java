import java.util.Scanner;

public class exempel9_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mata in temperaturen i Fahrenheit");
        double fahr = scan.nextDouble();

        double cel = tempOmvandling(fahr); //anrop

        System.out.println(fahr + " grader Fahrenheit är " + cel + " grader Celsius.");
    }
    static double tempOmvandling(double fahrenheit){ //definition
        double celsius = (fahrenheit - 32)/1.8;
        return celsius;
    }
}
