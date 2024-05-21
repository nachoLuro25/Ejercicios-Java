import java.util.Scanner;
public class EjercicioTres {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero > 100 && esPrimo(numero)) {
                System.out.println("El número " + numero + " es mayor a 100 y es primo.");
                break;
            } else {
                System.out.println("El número " + numero + " no cumple las condiciones. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
