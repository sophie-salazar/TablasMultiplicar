import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que elija una tabla
        System.out.print("Ingrese el número de la tabla de multiplicar que desea ver (1-12): ");
        int numero = scanner.nextInt();

        // Validar la entrada
        if (numero < 1 || numero > 12) {
            System.out.println("Por favor, ingrese un número entre 1 y 12.");
        } else {
            System.out.println("Tabla del " + numero + ":");
            // Generar la tabla seleccionada
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}