import java.util.Scanner;

public class fun34IVA {


    public static double precioConIVA(double precio, double iva) {

        return precio * iva;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //constante IVA para futuros  cambios
        final double IVA = 1.21;

        //Pedimos precios al usuario
        for (int i = 0; i < 5; i ++){
            System.out.println("Introduzca precio, le mostraremos el precio con IVA:  ");
            double precioSinIVA = sc.nextDouble();
            System.out.printf("El precio + IVA =  %2.0f \n ",precioConIVA(precioSinIVA,IVA));
        }



    }
}
