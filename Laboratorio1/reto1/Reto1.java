import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = List.of(
            new Estudiante("Rafael Moreno", 21, "rafael.moreno-v@mail.escuelaing.edu.co", 6),
            new Estudiante("Nombre Companero", 22, "critian.gonzalez-r@mail.escuelaing.edu.co", 7)
        );

        List<String> descripciones = estudiantes.stream()
                .map(e -> e.nombre + ", estudiante de " + e.semestre + "° semestre, " + e.edad + " años")
                .collect(Collectors.toList());

        List<String> correos = estudiantes.stream()
                .map(e -> e.correo)
                .collect(Collectors.toList());

        String mensaje = "¡Hola, bienvenidos! Nosotros somos la pareja conformada por "
                + String.join(" y ", descripciones)
                + ". Nuestros correos institucionales son "
                + String.join(" y ", correos) + ".";

        Consumer<String> imprimir = m -> System.out.println(m);
        imprimir.accept(mensaje);
    }
}

 