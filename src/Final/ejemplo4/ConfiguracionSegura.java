package Final.ejemplo4;

public final class ConfiguracionSegura {
    private String clave;

    public ConfiguracionSegura(String clave) {
        this.clave = clave;
    }

    public void mostrarInformacion() {
        System.out.println("Esta es una configuración segura.");
    }

    public String getClave() {
        return clave;
    }
}

// Intentar heredar de ConfiguracionSegura causaría un error de compilación
// La siguiente clase no compilaría:
/*
public class ConfiguracionInsegura extends ConfiguracionSegura {
    // Esta clase no puede extender ConfiguracionSegura porque es final
}
*/