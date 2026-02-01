import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    static Function<List<Integer>, Integer> maximo = lista ->
            lista.stream().max(Integer::compareTo).orElse(null);

    static Function<List<Integer>, Integer> minimo = lista ->
            lista.stream().min(Integer::compareTo).orElse(null);

    static Function<List<Integer>, Integer> cantidad = List::size;
}
