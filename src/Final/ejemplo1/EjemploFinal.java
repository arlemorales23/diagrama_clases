package Final.ejemplo1;

public class EjemploFinal {
    // Atributo final de clase
    private final int NUMERO_MAXIMO = 100;

    // Atributo final que se inicializa en el constructor
    private final String nombre;

    public EjemploFinal(String nombre) {
        this.nombre = nombre;
    }

    public void ejemploMetodo() {
        // Variable local final
        final double PI = 3.14159;

        System.out.println("El número máximo es: " + NUMERO_MAXIMO);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El valor de PI es: " + PI);

        // Las siguientes líneas causarían un error de compilación si se descomentaran:
        //NUMERO_MAXIMO = 200;  // Error: no se puede asignar un valor a una variable final
        // nombre = "Otro nombre";  // Error: no se puede cambiar el valor de un atributo final
        // PI = 3.14;  // Error: no se puede modificar una variable local final
    }
}
