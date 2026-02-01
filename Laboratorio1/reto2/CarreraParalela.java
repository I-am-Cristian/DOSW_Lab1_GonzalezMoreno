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

    static class Resultados {
    int max;
    int min;
    int cantidad;
    String maxEsMultiploDe2;
    String maxEsDivisorDe2;

    Resultados(int max, int min, int cantidad, String mult2, String div2) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;
        this.maxEsMultiploDe2 = mult2;
        this.maxEsDivisorDe2 = div2;
    }

    @Override
    public String toString() {
        return "Resultados{max=" + max + ", min=" + min + ", cantidad=" + cantidad
                + ", maxEsMultiploDe2=" + maxEsMultiploDe2
                + ", maxEsDivisorDe2=" + maxEsDivisorDe2 + "}";
    }
    }

}