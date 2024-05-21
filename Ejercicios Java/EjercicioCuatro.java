import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

	public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Marcos");
        nombres.add("Facundo");
        nombres.add("Enrique");
        nombres.add("Julieta");
        nombres.add("Paula");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
