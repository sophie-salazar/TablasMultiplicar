import java.util.Scanner;
import java.util.stream.IntStream;

public class TablasMultiplicarFuncional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario ingresar el número de la tabla
        System.out.print("Ingrese el número para mostrar la tabla de multiplicar (1-12): ");
        int numero = scanner.nextInt();

        // Verifica que el número esté dentro del rango válido (1-12)
        if (numero < 1 || numero > 12) {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 12.");
        } else {
            // Llamada a la función pura para mostrar la tabla
            mostrarTablaMultiplicar(numero);
        }

        scanner.close(); // Cierra el scanner
    }

    // Función pura que muestra la tabla de multiplicar utilizando Streams
    private static void mostrarTablaMultiplicar(int numero) {
        // Usamos un IntStream para generar los números de la tabla (1 a 12)
        IntStream.range(1, 13)
                 .forEach(i -> System.out.println(numero + " x " + i + " = " + (numero * i)));
    }
}

