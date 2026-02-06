import java.util.*;
import java.util.stream.*;

public class Reto4 {

    // A: HashMap, ignora claves duplicadas (se queda con el primer valor)
    public static Map<String, Integer> construirMapa(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> p : pares) {
            map.putIfAbsent(p.getKey(), p.getValue()); // conserva el primero
        }
        return map;
    }

   
}
