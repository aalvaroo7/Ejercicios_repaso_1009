import java.util.Scanner;

public class EJ_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número mayor que cero (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                int digitos = String.valueOf(numero).length();
                System.out.println("El número de dígitos es: " + digitos);
            }
        } while (numero != 0);

        System.out.println("Programa finalizado.");
    }
}