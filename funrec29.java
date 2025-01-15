import java.util.Arrays;

public class funrec29 {




    public static int[] calcularDia(int[]dia){

        int[] diaSig = new int[3];

        for(int i=0; i<dia.length; i++){
            diaSig[i] = dia[i]+1;
        }


        return diaSig;

    }



    public static void main(String[] args) {

        int[] dia = {15,3,2025};

        int[] diaResult = calcularDia(dia);

        System.out.println(Arrays.toString(diaResult));



    }
}
