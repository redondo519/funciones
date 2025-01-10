import java.util.Arrays;

public class funrec20 {


    public static void primitiva(int correcto[],int num[], int i){
        for(i=0;i<num.length;i++){
            if(num[i]==correcto[i]){
                i++;
            }

        }
    }
    public static void main(String[] args) {

        int cont = 0;
        int voletoCorrecto[]= {1,30,2,4,12};
        int voletoIncorrecto[]= {1,20,2,4,11};
        primitiva(voletoCorrecto,voletoIncorrecto,cont);

        System.out.println(Arrays.toString(voletoCorrecto));
        System.out.println(Arrays.toString(voletoIncorrecto));
        System.out.println(cont);

    }
}
