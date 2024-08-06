package Final.ejemplo2;

public class Main {
    public static void main(String[] args) {
        // Acceso directo a las constantes sin crear una instancia
        System.out.println("Constante de clase: " + ConfiguracionAplicacion.NOMBRE_APP);

        // Llamada a un método estático que usa las constantes
        ConfiguracionAplicacion.imprimirInformacion();

        // Uso en una instancia de la clase
        ConfiguracionAplicacion config = new ConfiguracionAplicacion();
        config.conectarAPI();
    }
    }

