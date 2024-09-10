import java.util.Scanner;

public class Ej_circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor del radio: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);
    }
}
