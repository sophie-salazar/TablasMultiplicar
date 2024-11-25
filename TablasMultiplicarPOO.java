import java.util.Scanner;

// Clase que representa la funcionalidad de mostrar la tabla de multiplicar
class TablaMultiplicar {
    private int numero;  // Atributo que almacena el número para la tabla de multiplicar

    // Constructor de la clase que inicializa el número de la tabla
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    // Método para mostrar la tabla de multiplicar del número almacenado
    public void mostrarTabla() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

public class TablasMultiplicarPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario ingresar el número de la tabla
        System.out.print("Ingrese el número para mostrar la tabla de multiplicar (1-12): ");
        int numero = scanner.nextInt();

        // Verifica que el número esté dentro del rango válido (1-12)
        if (numero < 1 || numero > 12) {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 12.");
        } else {
            // Crea un objeto de la clase TablaMultiplicar y muestra la tabla
            TablaMultiplicar tabla = new TablaMultiplicar(numero);
            tabla.mostrarTabla();
        }

        scanner.close(); // Cierra el scanner
    }
}

