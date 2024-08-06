package Final.ejemplo2;

public class ConfiguracionAplicacion {
    // Constantes de clase (final static)
    public static final String NOMBRE_APP = "MiAplicación";
    public static final int VERSION_MAYOR = 1;
    public static final int VERSION_MENOR = 2;
    public static final String URL_API = "https://api.miaplicacion.com";

    // Método que usa las constantes
    public static void imprimirInformacion() {
        System.out.println("Nombre de la aplicación: " + NOMBRE_APP);
        System.out.println("Versión: " + VERSION_MAYOR + "." + VERSION_MENOR);
        System.out.println("URL de la API: " + URL_API);
    }

    // Ejemplo de uso en un método no estático
    public void conectarAPI() {
        System.out.println("Conectando a " + URL_API);
        // Lógica de conexión...
    }
}