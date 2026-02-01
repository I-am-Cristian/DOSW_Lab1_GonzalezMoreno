import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    static Function<List<Integer>, Integer> maximo = lista ->
            lista.stream().max(Integer::compareTo).orElse(null);

    static Function<List<Integer>, Integer> minimo = lista ->
            lista.stream().min(Integer::compareTo).orElse(null);

    static Function<List<Integer>, Integer> cantidad = List::size;

    static class Resultados {
        int max;
        int min;
        int cantidad;

        Resultados(int max, int min, int cantidad) {
            this.max = max;
            this.min = min;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return "Resultados{max=" + max + ", min=" + min + ", cantidad=" + cantidad + "}";
        }
    }

    static Resultados obtenerResultados(List<Integer> lista) {
        int max = maximo.apply(lista);
        int min = minimo.apply(lista);
        int cant = cantidad.apply(lista);
        return new Resultados(max, min, cant);
    }
}
