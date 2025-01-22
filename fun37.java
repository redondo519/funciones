import java.util.Random;
import java.util.Scanner;


public class fun37 {


    public static int contarCaracteres(String texto) {
        int i = texto.length();

        return i;
    }

    public static void contarCaracteres2(String texto) {
        int i = texto.length();

        System.out.printf("2. La frase '%s' tiene '%d' caracteres.",texto,i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos texto
        System.out.println("Ingrese la frase: ");
        String frase = sc.nextLine();


        System.out.println("1 o 2");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1->
                contarCaracteres2(frase);
            case 2->
            System.out.printf("1. La frase '%s' tiene '%d' caracteres.", frase,contarCaracteres(frase));
        }


    }
}
