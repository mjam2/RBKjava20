package kapitel8;

public class ovning8_6 {
    public static void main(String[] args) {
         double folkmängd = 1000000;
         int år = 0;
         while (folkmängd<2000000)
         {
             folkmängd = folkmängd*1.05;
             år++;
         }
        System.out.println("Antal år: "+år);
    }
}
