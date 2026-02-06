import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    public static Set<Integer> generarGuerreros() {
        Random r = new Random();
        Set<Integer> treeSet = new TreeSet<>();

        while (treeSet.size() < 15) {
            treeSet.add(r.nextInt(31));
        }

        return treeSet.stream()
                .filter(n -> n % 5 != 0)    
                .collect(Collectors.toCollection(TreeSet::new));
    }
}