package kapitel4;

public class Repititionsfrågor {
    public static void main(String[] args) {
        //RF4_1();
        //RF4_2();
        //RF4_3();
        RF4_4();
        RF4_5();
    }

    private static void RF4_5() {
        System.out.println(56789*100/100);
        System.out.println(56789/100*100);
        System.out.println((56789+50)/100*100);
        System.out.println((56789+500)/1000*1000);
        System.out.println((int)(234.56+0.5));
    //Kan vara bra för att avrunda till olika värden.
    }


    private static void RF4_4() {
        double tal1 = 8;
        int tal2 = 8;
        int tal3 = 5;
        System.out.println(tal1/tal3);
        System.out.println(tal2/tal3);
        System.out.println(tal2%tal3);
        System.out.println(tal2++);
        System.out.println(++tal3);
    }

    private static void RF4_3() {
       // Om det är förre räknas det med innan om det är med efter räknas det med efter.
    }

    private static void RF4_2() {
        //Det hämtar resten av divison t.ex 10/3 = 3.33333 men med modulu blir det 1. Det kan vara bra
        //när man vill omvandla olika enheter osv.
    }

    private static void RF4_1() {
        //tal++,++tal,tal=+1,tal +=1
    }
}
