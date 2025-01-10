import java.util.Scanner;

public class funRecursiva {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número base y el exponente
        System.out.print("Introduce el número base (real): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero): ");
        int exponente = scanner.nextInt();

        // Inicializar la variable para almacenar el resultado de la potencia
        double resultado = 1;

        // Usar un bucle for para calcular la potencia
        if (exponente > 0) {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
        } else if (exponente < 0) {
            for (int i = 1; i <= -exponente; i++) {
                resultado *= base;
            }
            resultado = 1 / resultado; // Para exponentes negativos, invertimos el resultado
        }

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        scanner.close();
    }
}
