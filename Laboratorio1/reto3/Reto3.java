import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    // Estudiante A: repite 3 veces usando stream() y concatena con StringBuilder
    public static String ecoBuilder(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" ")); // stream() procesando repeticiones

        StringBuilder sb = new StringBuilder();
        sb.append(repetido);
        return sb.toString();
    }

    // PRIMER CHOQUE: ambos crearán un método con el mismo nombre
    // (por ahora, el A lo implementa “a su manera”)
    public static String ecoMisterioso(String mensaje) {
        // A: repetir y luego invertir (puede invertir con builder o con StringBuilder reverse)
        String repetido = ecoBuilder(mensaje);
        return new StringBuilder(repetido).reverse().toString();
    }
}
