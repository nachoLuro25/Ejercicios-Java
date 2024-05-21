import java.util.Scanner;

public class EjercicioCinco {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo n�mero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elige una operaci�n:");
        System.out.println("1: Suma (+)");
        System.out.println("2: Resta (-)");
        System.out.println("3: Multiplicaci�n (*)");
        System.out.println("4: Divisi�n (/)");

        int opcion = scanner.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Error: Divisi�n por cero no permitida.");
                }
                break;
            default:
                System.out.println("Opci�n no v�lida.");
                break;
        }

        scanner.close();
    }
}
