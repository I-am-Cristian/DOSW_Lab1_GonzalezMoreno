import java.util.*;
import java.util.stream.*;

public class Reto4 {

    public static Map<String, Integer> construirMapa(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> p : pares) {
            table.putIfAbsent(p.getKey(), p.getValue()); 
        }
        return table;
    }
}