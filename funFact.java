public class funFact {


    public static long factorial(int n) {
        long resultado;

        if (n == 0) {
            resultado = 1;
        }else {
            resultado = factorial(n - 1) * n;
        }
        return resultado;
    }

    public static void main(String[] args) {

        factorial(3);
    }
}
