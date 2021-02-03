import java.util.Scanner;

public class MethodmedfältsomParameter {
    static int antal;
    public static void main(String[] args) {
        double[] tid = new double[100];
        inTid(tid);
        utTid(tid);
        System.out.println("Den snabbaste tiden är "+snabbTid(tid));
    }
    static void inTid(double[] tid){
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in tiderna. Avsluta med 0.");
        antal = 0;
        double temp = Double.valueOf(scan.nextLine());
        while(temp!= 0){
            tid[antal] = temp;
            antal++;
            temp = Double.valueOf(scan.nextLine());
        }
    }
    static void utTid(double[] tid){
        System.out.println("Tiderna är: ");
        for (int i=0; i<antal; i++){
            System.out.println(" "+tid[i]);

        }
        System.out.println();
    }

static double snabbTid(double[]tid){
    double snabbast = tid[0];
    for (int i=1; i<antal;i++){
    if (snabbast>tid[i]){
        snabbast = tid[i];
    }
}
return snabbast;
}
}

