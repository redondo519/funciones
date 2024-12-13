import java.util.Scanner;

public class fun2 {

    //ejercicio uno de funciones
    //mostrar texto n veces (n esta en funcion eco)

    public static void com(int a,int b){

        for (int i=a+1 ; i<b; i++){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int a = sc.nextInt();

            System.out.println("Introduce el segundo numero: ");
            int b = sc.nextInt();

        com(a,b);


    }
}
