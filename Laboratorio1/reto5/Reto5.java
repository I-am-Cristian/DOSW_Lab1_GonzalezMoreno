import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {

    // A: HashSet sin orden, elimina múltiplos de 3
    public static Set<Integer> generarGuerreros() {
        Random r = new Random();
        Set<Integer> hashSet = new HashSet<>();

        // genera 15 números aleatorios (0..30) por ejemplo
        while (hashSet.size() < 15) {
            hashSet.add(r.nextInt(31));
        }

        return hashSet.stream()
                .filter(n -> n % 3 != 0)     // stream().filter()
                .collect(Collectors.toSet());
    }
}
