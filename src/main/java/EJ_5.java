import java.util.Scanner;

public class EJ_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.println("Introduce números para calcular la media (0 para terminar):");

        while ((numero = scanner.nextInt()) != 0) {
            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se han introducido números.");
        }
    }
}
