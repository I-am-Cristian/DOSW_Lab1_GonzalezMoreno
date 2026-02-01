import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    //  máximo 
    static Function<List<Integer>, Integer> maximo = lista ->
            lista.stream().max(Integer::compareTo).orElse(null);

    // mínimo 
    static Function<List<Integer>, Integer> minimo = lista ->
            lista.stream().min(Integer::compareTo).orElse(null);

    // cantidad 
    static Function<List<Integer>, Integer> cantidad = List::size;

    // Objeto que guarda los resultados del análisis de UNA lista
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
            return "Resultados{" +
                    "max=" + max +
                    ", min=" + min +
                    ", cantidad=" + cantidad +
                    ", maxEsMultiploDe2=" + maxEsMultiploDe2 +
                    ", maxEsDivisorDe2=" + maxEsDivisorDe2 +
                    '}';
        }
    }

    // Función que junta lo que hacen las lambdas y arma el objeto Resultados
    static Resultados obtenerResultados(List<Integer> lista) {
        Integer max = maximo.apply(lista);
        Integer min = minimo.apply(lista);
        int cant = cantidad.apply(lista);

        // Manejo simple por si la lista viene vacía (max/min serían null)
        if (max == null || min == null) {
            return new Resultados(0, 0, cant, "NO", "NO");
        }

        // Segunda vuelta: ternarios sobre el máximo
        String mult2 = (max % 2 == 0) ? "SI" : "NO";
        String div2 = (max != 0 && 2 % max == 0) ? "SI" : "NO";

        return new Resultados(max, min, cant, mult2, div2);
    }

    // Main de prueba 
    public static void main(String[] args) {
        List<Integer> lista = List.of(2, 7, 4, 9);
        Resultados r = obtenerResultados(lista);
        System.out.println(r);
    }
}
