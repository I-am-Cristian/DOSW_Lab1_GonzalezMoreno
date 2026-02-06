import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {

    // A: HashSet sin orden, elimina múltiplos de 3
    public static Set<Integer> guerrerosHashSetSinMultiplosDe3(int cantidad, int max) {
        Random r = new Random();
        Set<Integer> hashSet = new HashSet<>();

        while (hashSet.size() < cantidad) {
            hashSet.add(r.nextInt(max + 1));
        }

        return hashSet.stream()
                .filter(n -> n % 3 != 0) // stream().filter()
                .collect(Collectors.toSet());
    }

    // B: TreeSet ordenado, elimina múltiplos de 5
    public static Set<Integer> guerrerosTreeSetSinMultiplosDe5(int cantidad, int max) {
        Random r = new Random();
        Set<Integer> treeSet = new TreeSet<>();

        while (treeSet.size() < cantidad) {
            treeSet.add(r.nextInt(max + 1));
        }

        return treeSet.stream()
                .filter(n -> n % 5 != 0) // stream().filter()
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // Choque final: unir ambas colecciones en una sola estructura ORDENADA y sin duplicados
    public static Set<Integer> unionOrdenada(Set<Integer> a, Set<Integer> b) {
        return Stream.concat(a.stream(), b.stream())
                .collect(Collectors.toCollection(TreeSet::new)); // TreeSet = orden + sin duplicados
    }

    // MAIN de prueba (incluye ejemplo del enunciado)
    public static void main(String[] args) {

        // Ejemplo fijo del enunciado (para demostrar correcto)
        Set<Integer> hashSetEj = new HashSet<>(Set.of(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSetEj = new TreeSet<>(Set.of(12, 3, 25, 10, 7, 30, 18, 4));

        // Aplicar filtros con stream().filter()
        Set<Integer> hashFiltrado = hashSetEj.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());

        Set<Integer> treeFiltrado = treeSetEj.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        Set<Integer> union = unionOrdenada(hashFiltrado, treeFiltrado);

        // Lambda para imprimir
        Consumer<Integer> imprimir = n -> System.out.println("Número en arena: " + n);

        union.forEach(imprimir);
    }
}
