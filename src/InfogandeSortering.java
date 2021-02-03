public class InfogandeSortering {
    public static void main(String[] args) {
        int[] lista = new int[100];

        int i;
        if (lista.length<2)return;
        int temp;
        for (int n=1; n<lista.length;n++){
            temp = lista[n];
            i= n-1;

            while (i>=0 && lista[i]> temp){
                lista[i+1] = lista[i];   //Förskjut åt höger
                i--;
            }

            lista[i+1] = temp;          //Infoga på den tomma platsen
        }
    }
}
