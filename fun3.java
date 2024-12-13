import java.util.Scanner;

public class fun3 {

    public static void areaVolumen(double radio, double altura, int opcion){
        if(opcion == 1){
            double area = 2* Math.PI * (altura+radio);
            System.out.println("Area: " + area);

        }else if(opcion == 2){
            double volumen = Math.PI *  Math.pow(radio, 2)* altura;
            System.out.println("Volumen: " + volumen);
        }else{
            System.out.println("Opcion no valida");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        double r = sc.nextDouble();
        System.out.println("Introduzca la altura: ");
        double a = sc.nextDouble();
        System.out.println("Introduzca la opcion: ");
        int opcion = sc.nextInt();
        areaVolumen(r,a,opcion);

    }
}
