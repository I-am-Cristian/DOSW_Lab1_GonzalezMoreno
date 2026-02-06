import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> acciones = new HashMap<>();

    static {
        // Fragmento A
        acciones.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        acciones.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        acciones.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        acciones.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));

        // Fragmento B
        acciones.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));
        acciones.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        acciones.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh… los bugs están dormidos"));
        acciones.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                acciones.get(comando).run(); // Runnable + lambda
                break;
            default:
                System.out.println("Comando desconocido: " + comando);
        }
    }

    public static void main(String[] args) {
        // Demostrar funcionamiento llamando a TODOS los comandos disponibles
        ejecutarComando("SALUDAR");
        ejecutarComando("DESPEDIR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");

        // Extra: probar comando inválido
        ejecutarComando("HACKEAR");
    }
}
