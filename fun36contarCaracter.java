import java.util.Scanner;

public class fun36contarCaracter {

    public static void contarCaracteres(String cadena) {

        int num = cadena.length();

        System.out.printf("La cadena  %s tiene  %d  numero de caracteres \n ",cadena,num);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c;
        int cVacias = 0;
        //Pedir cadenas hasta la 0000
        do{
            System.out.print("Ingrese una cadena de carcteres: ");
            c = sc.nextLine();

            if (c.isEmpty()){
                System.out.println("La cadena esta vacia");
                cVacias++;
            }

            if (c.equals("0000")){
                break;
            }

            contarCaracteres(c);
        }while(!(c.equals("0000")));

        System.out.println();
        System.out.println("Numero de cadenas vacias: " + cVacias);






    }
}
