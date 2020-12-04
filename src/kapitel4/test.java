package kapitel4;

public class test {
    public static void main(String[] args) {

        int a = 3;
        a -= -1;



        int b = 2*a++;
        --b;


        int c = --b % (a/2+2);
        c *=3;





        System.out.println(2*c%(16%9));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
