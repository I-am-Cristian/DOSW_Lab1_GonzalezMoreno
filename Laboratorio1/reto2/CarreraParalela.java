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
        // Indica si la cantidad de elementos es par o impar (Tercer choque)
        String cantidadParImpar;

        Resultados(int max, int min, int cantidad,
                   String mult2, String div2, String parImpar) {
            this.max = max;
            this.min = min;
            this.cantidad = cantidad;
            this.maxEsMultiploDe2 = mult2;
            this.maxEsDivisorDe2 = div2;
            this.cantidadParImpar = parImpar;
        }

        @Override
        public String toString() {
            return "Resultados{" +
                    "max=" + max +
                    ", min=" + min +
                    ", cantidad=" + cantidad +
                    ", maxEsMultiploDe2=" + maxEsMultiploDe2 +
                    ", maxEsDivisorDe2=" + maxEsDivisorDe2 +
                    ", cantidadParImpar=" + cantidadParImpar +
                    '}';
        }
    }

    // Función que junta lo que hacen las lambdas y arma el objeto Resultados
    static Resultados obtenerResultados(List<Integer> lista) {
        Integer max = maximo.apply(lista);
        Integer min = minimo.apply(lista);
        int cant = cantidad.apply(lista);

        // Manejo simple por si la lista viene vacía 
        if (max == null || min == null) {
            return new Resultados(0, 0, cant, "NO", "NO", "N/A");
        }

        // Segunda vuelta: ternarios sobre el máximo
        String mult2 = (max % 2 == 0) ? "SI" : "NO";
        String div2 = (max != 0 && 2 % max == 0) ? "SI" : "NO";
        
        // Verificar si la cantidad es par o impar (Tercer choque)
        String parImpar = (cant % 2 == 0) ? "PAR" : "IMPAR";

        return new Resultados(max, min, cant, mult2, div2, parImpar);
    }

    // Objeto que guarda los resultados del análisis de DOS listas (Gran meta)
    static class ResultadosDoble {
        Resultados lista1;
        Resultados lista2;

        ResultadosDoble(Resultados lista1, Resultados lista2) {
            this.lista1 = lista1;
            this.lista2 = lista2;
        }

        @Override
        public String toString() {
            return "ResultadosDoble{" +
                    "lista1=" + lista1 +
                    ", lista2=" + lista2 +
                    '}';
        }
    }

    // Función final que analiza dos listados y unifica todos los resultados (Gran meta)
    static ResultadosDoble analizarDosListas(List<Integer> lista1,
                                             List<Integer> lista2) {
        Resultados r1 = obtenerResultados(lista1);
        Resultados r2 = obtenerResultados(lista2);
        return new ResultadosDoble(r1, r2);
    }

    // Main de prueba 
    public static void main(String[] args) {
        List<Integer> listaA = List.of(2, 7, 4, 9);
        List<Integer> listaB = List.of(1, 8, 3);

        ResultadosDoble resultadoFinal =
                analizarDosListas(listaA, listaB);

        System.out.println(resultadoFinal);
    }
}
