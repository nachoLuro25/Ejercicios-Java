public class EjercicioDos {
	
	public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " primo");
            } else {
                System.out.print(i + " divisores: ");
                imprimirDivisores(i);
                System.out.println();
            }
        }
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

    public static void imprimirDivisores(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}