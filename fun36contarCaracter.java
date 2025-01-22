import java.util.Scanner;

public class fun36contarCaracter {

    public static void contarCaracteres(String cadena) {

        int num = cadena.length();
        String ultimo = String.valueOf(cadena.charAt(num - 1));

        System.out.printf("La cadena  %s tiene  %d  numero de caracteres y su último carcter es '%s' \n ",cadena,num,ultimo);
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
