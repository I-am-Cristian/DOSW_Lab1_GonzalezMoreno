import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    // A: HashMap, ignora claves duplicadas (conserva el primer valor encontrado)
    public static Map<String, Integer> construirHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> p : pares) {
            map.putIfAbsent(p.getKey(), p.getValue());
        }
        return map;
    }

    // B: Hashtable, asegurando sincronización (thread-safe)
    public static Map<String, Integer> construirHashTable(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> p : pares) {
            table.putIfAbsent(p.getKey(), p.getValue());
        }
        return table;
    }

    // Combina ambos mapas en uno solo. Si hay conflicto de claves, prioriza Hashtable
    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap,
                                                     Map<String, Integer> hashTable) {
        Map<String, Integer> combinado = new HashMap<>(hashMap);
        hashTable.forEach(combinado::put); 
        return combinado;
    }

    // FUNCIÓN FINAL UNIFICADA:
    // - combina HashMap y Hashtable
    // - prioriza valores del Hashtable en caso de conflicto
    // - convierte claves a mayúsculas
    // - imprime en orden ascendente de clave
    // - usa stream(), map(), sorted(), Collectors.toMap() y lambda
    public static void tesoroFinal(Map<String, Integer> hashMap,
                                   Map<String, Integer> hashTable) {

        Map<String, Integer> combinado = Stream.concat(
                        hashMap.entrySet().stream(),
                        hashTable.entrySet().stream()
                )
                .map(e -> Map.entry(e.getKey().toUpperCase(), e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorAnterior, valorNuevo) -> valorNuevo // lambda: gana Hashtable
                ));

        combinado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

    // MAIN de prueba con el ejemplo del enunciado
    public static void main(String[] args) {
        // Entrada HashMap (simulando el input del enunciado)
        List<Map.Entry<String, Integer>> entradaHashMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        // Entrada Hashtable (simulando el input del enunciado)
        List<Map.Entry<String, Integer>> entradaHashTable = List.of(
                Map.entry("plata", 8),
                Map.entry("rubí", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 6)
        );

        Map<String, Integer> hm = construirHashMap(entradaHashMap);
        Map<String, Integer> ht = construirHashTable(entradaHashTable);

        System.out.println("===== SALIDA TESORO =====");
        tesoroFinal(hm, ht);
    }
}
