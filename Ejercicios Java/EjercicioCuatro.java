import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

	public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        nombres.add("David");
        nombres.add("Elena");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}