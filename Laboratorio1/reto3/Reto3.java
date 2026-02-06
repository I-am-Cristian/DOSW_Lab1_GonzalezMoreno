import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    // A: stream() + StringBuilder (repetición)
    public static String ecoBuilder(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        StringBuilder sb = new StringBuilder();
        sb.append(repetido);
        return sb.toString();
    }

    // B: StringBuffer (reverse)
    public static String ecoBufferReverse(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }

    // FUNCIÓN COMBINADA (la del “choque”): repetir 3 veces y luego invertir
    public static String ecoMisterioso(String mensaje) {
        String repetido = ecoBuilder(mensaje);
        return ecoBufferReverse(repetido);
    }

    // Lambda para invocar la función combinada
    public static void demo() {
        Function<String, String> eco = Reto3::ecoMisterioso; // lambda / referencia a método
        System.out.println(eco.apply("hola"));
    }
}
