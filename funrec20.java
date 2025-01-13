import java.util.Arrays;

public class funrec20 {


    public static int primitiva(int correcto[],int num[]){
       int aciertos = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]==correcto[i]){
                //System.out.print(correcto[i]+" ");
                //System.out.println();
                aciertos++;
            }


        }
        return aciertos;
    }

    public static void main(String[] args) {


        int voletoCorrecto[]= {1,30,2,4,12,6};
        int voletoIncorrecto[]= {1,20,2,4,11,6};
        primitiva(voletoCorrecto,voletoIncorrecto);


        //System.out.println(Arrays.toString(voletoCorrecto));
        //System.out.println(Arrays.toString(voletoIncorrecto));

        System.out.println(primitiva(voletoCorrecto,voletoIncorrecto));


    }
}
