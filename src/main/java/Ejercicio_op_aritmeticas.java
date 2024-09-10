import java.util.Scanner;

public class Ejercicio_op_aritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer valor entero: ");
        int valor1 = scanner.nextInt();

        System.out.print("Introduce el segundo valor entero: ");
        int valor2 = scanner.nextInt();

        System.out.println("Suma: " + (valor1 + valor2));
        System.out.println("Resta: " + (valor1 - valor2));
        System.out.println("Producto: " + (valor1 * valor2));
        System.out.println("División: " + ((double) valor1 / valor2));
    }
}
