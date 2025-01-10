public class funRecursiva3 {


    public static int mcd(int a, int b) {
        // Caso base: Si b es 0, el MCD es a
        if (b == 0) {
            return a;
        } else {

            return mcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int num1 = 36;
        int num2 = 60;

        int resultado = mcd(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
    }
}
