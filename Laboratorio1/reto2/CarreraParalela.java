import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    static Function<List<Integer>, Integer> maximo = lista ->
            lista.stream().max(Integer::compareTo).orElse(null);
}