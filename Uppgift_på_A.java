public class Uppgift_på_A {
    public static void main(String[] args) {
        //loop som adderar med 2 och börjar med 1
        //kolla om den är delbar med 7
        // och om den är delbar med 7 så ska den kolla om den innehåller 2st femmor
        //annars + 2 igen

        for (int t = 1; t <= 10000; t+=2) {
            if (t % 7 == 0) {
                String TString = "" + t; //rc 5523 --> "5523"

                int antalFemmor = 0;
                // Loopar igenom varje tecken i TString:

                for (int i = 0; i<TString.length(); i++){
                    if (TString.charAt(i) == '5'){
                        antalFemmor++;
                    }
                }
                if (antalFemmor == 2){
                    System.out.println(t);
                }
                }
            }

        }
    }
