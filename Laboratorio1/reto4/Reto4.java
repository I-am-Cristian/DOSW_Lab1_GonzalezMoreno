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

    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap,
                                                 Map<String, Integer> hashTable) {
    Map<String, Integer> combinado = new Hashtable<>();
    combinado.putAll(hashMap);
    combinado.putAll(hashTable); // pisa con Hashtable (prioridad)
    return combinado;
    }

    public static void imprimirOrdenado(Map<String, Integer> mapa) {
    mapa.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }
    
}