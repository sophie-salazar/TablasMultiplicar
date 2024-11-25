import java.util.Scanner;

// Clase que representa la tabla de multiplicar
class TablaMultiplicarLogica {

    // Predicado para mostrar la tabla de multiplicar
    public static void mostrarTabla(int numero, int i) {
        // Base de la recursión: si i llega a 13, terminamos
        if (i > 12) {
            return;
        }
        // Imprimir la multiplicación
        System.out.println(numero + " x " + i + " = " + (numero * i));
        // Llamada recursiva para el siguiente número
        mostrarTabla(numero, i + 1);
    }

}

public class TablasMultiplicarLogica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario ingresar el número de la tabla
        System.out.print("Ingrese el número para mostrar la tabla de multiplicar (1-12): ");
        int numero = scanner.nextInt();

        // Verifica que el número esté dentro del rango válido (1-12)
        if (numero < 1 || numero > 12) {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 12.");
        } else {
            // Llamada al predicado para mostrar la tabla, comenzando con i = 1
            TablaMultiplicarLogica.mostrarTabla(numero, 1);
        }

        scanner.close(); // Cierra el scanner
    }
}
