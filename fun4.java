import java.util.Scanner;

public class fun4 {

    public static int maximo(int a, int b){
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un  numero: ");
        int num = sc.nextInt();

        System.out.println("Introduce un  numero: ");
        int num2 = sc.nextInt();

        int max = maximo(num,num2);

        System.out.println("El maximo es : "+max);
    }
}
