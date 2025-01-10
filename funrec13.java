import java.util.Scanner;


public class funrec13 {


    public static void esfera(double r){

        double superficie;
        superficie = 4 * Math.PI * Math.pow(r, 2);

        System.out.printf("Superficie %.2f",superficie);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radio: ");
        double radio = sc.nextInt();
        esfera(radio);
    }
}
