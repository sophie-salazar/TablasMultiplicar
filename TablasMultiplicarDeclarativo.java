import java.util.Scanner;
import java.util.stream.IntStream;

public class TablasMultiplicarDeclarativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese el número de la tabla
        System.out.print("Ingrese el número para mostrar la tabla de multiplicar (1-12): ");
        int numero = scanner.nextInt();

        // Verifica que el número esté dentro del rango válido (1 a 12)
        if (numero < 1 || numero > 12) {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 12.");
        } else {
            // Utiliza streams para generar y mostrar la tabla de multiplicar
            mostrarTablaMultiplicar(numero);
        }

        scanner.close(); // Cierra el scanner
    }

    // Método declarativo usando streams para mostrar la tabla de multiplicar
    private static void mostrarTablaMultiplicar(int numero) {
        // Usa un stream para generar los resultados de la tabla de multiplicar
        IntStream.range(1, 13)
                 .forEach(i -> System.out.println(numero + " x " + i + " = " + (numero * i)));
    }
}

