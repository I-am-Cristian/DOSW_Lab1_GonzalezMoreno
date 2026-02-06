public class Reto3 {
    
    public static String ecoBufferReverse(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }
    public static String ecoMisterioso(String mensaje) {
        String repetido = mensaje + " " + mensaje + " " + mensaje;
        return new StringBuffer(repetido).reverse().toString();
    }
}