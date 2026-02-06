import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    // stream() + StringBuilder (repetición)
    public static String ecoBuilder(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        StringBuilder sb = new StringBuilder();
        sb.append(repetido);
        return sb.toString();
    }

    // StringBuffer (reverse)
    public static String ecoBufferReverse(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }

    // FUNCIÓN COMBINADA: repetir 3 veces y luego invertir
    public static String ecoMisterioso(String mensaje) {
        String repetido = ecoBuilder(mensaje);
        return ecoBufferReverse(repetido);
    }

    // Lambda para invocar la función combinada
    public static void demo() {
        Function<String, String> eco = Reto3::ecoMisterioso;
        System.out.println("Demo lambda con 'hola': " + eco.apply("hola"));
    }

    // MAIN /Para hacer pruebas de que si este sirviendo)
    public static void main(String[] args) {

        String mensaje = "hola";

        System.out.println("===== PRUEBA RETO 3 =====");

        // 1Solo repetición (StringBuilder)
        String repetido = ecoBuilder(mensaje);
        System.out.println("Repetido (builder): " + repetido);

        // Solo reverse (StringBuffer)
        String invertido = ecoBufferReverse(mensaje);
        System.out.println("Invertido (buffer): " + invertido);

        // Función combinada
        String resultadoFinal = ecoMisterioso(mensaje);
        System.out.println("Eco misterioso (repetir + invertir): " + resultadoFinal);

        // Invocación con lambda
        Function<String, String> ecoLambda = Reto3::ecoMisterioso;
        System.out.println("Lambda aplicada a 'java': " + ecoLambda.apply("java"));

        // Método demo()
        demo();

        System.out.println("===== FIN PRUEBAS =====");
    }
}
