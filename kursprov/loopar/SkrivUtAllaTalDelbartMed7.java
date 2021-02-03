package kursprov.loopar;

public class SkrivUtAllaTalDelbartMed7 {
    public static void main(String[] args) {
     int   delbart= 7;
        for (int i = 7; i<10000;i++){
            String tal = String.valueOf(i);
            int siffersumma = 0;
            for (int n = 0; n<tal.length();n++){
                siffersumma+=Integer.valueOf(tal.substring(n,n+1));
            }
            if (i % delbart == 0){

                System.out.println(i);
            }
            else continue;
        }
    }
}
