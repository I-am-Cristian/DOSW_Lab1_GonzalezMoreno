import java.util.*;

public class Reto4 {

    // Construye HashMap (ignora duplicadas, conserva primer valor)
    public static Map<String, Integer> construirHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<String, Integer> p : pares) {
            map.putIfAbsent(p.getKey(), p.getValue());
        }

        return map;
    }

    // Construye Hashtable (sincronizado)
    public static Map<String, Integer> construirHashTable(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> table = new Hashtable<>();

        for (Map.Entry<String, Integer> p : pares) {
            table.putIfAbsent(p.getKey(), p.getValue());
        }

        return table;
    }

    // Combina mapas dejando prioridad Hashtable
    public static Map<String, Integer> combinarMapas(
            Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);

        // pisa valores si existen porque Hashtable tiene prioridad
        hashTable.forEach(combinado::put);

        return combinado;
    }
}
