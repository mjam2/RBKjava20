public class BubbelSortering_Binär_Sekventiell_Sökning {
    public static void main(String[] args) {
        int[] lista = new int[100];
        for (int m=lista.length-1;m>0; m--){
            for (int n =0; n<m;n++){
                if (lista[n]>lista[n+1]){

                    int temp= lista[n];
                    lista[n] = lista[n+1];
                    lista[n+1] = temp;
                }
            }
        }
    }

    public int Sök (int[]lista, int värde){
        int index = -1;
        for (int i =0; i<lista.length;i++){
            if (lista[i]==värde){
                index=i;
                break;
            }
        }
        return index;
    }
    int sökvärde;
    public int BinärSök (int[]lista,int sökvärde){
        int min =0;
        int max= lista.length-1;
        int index= -1;

        while( min<=max && index == -1){
            int mitt = (min+max)/2;
            if (sökvärde>lista[mitt])       min = mitt+1;
            else if (sökvärde<lista[mitt])  max=mitt-1;
            else                            index=mitt;
        }
        return index;
    }
}
