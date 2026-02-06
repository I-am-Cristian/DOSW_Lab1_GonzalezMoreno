import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> acciones = new HashMap<>();

    static {
        acciones.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        acciones.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        acciones.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        acciones.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                acciones.get(comando).run();
                break;
            default:
                System.out.println("Comando desconocido: " + comando);
        }
    }
}
