import java.util.Scanner;

public class Ejercicio_M03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido al curso de M03B, " + nombre);
    }
}
