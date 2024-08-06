package Final.ejemplo5;

public class EjemploFinalParametro {

    public void procesarDatos(final int[] datos, final String nombre) {
        System.out.println("Procesando datos para: " + nombre);

        // Esto es válido: podemos acceder y usar los elementos del array
        for (int dato : datos) {
            System.out.println(dato);
        }

        // Esto también es válido: podemos modificar los elementos del array
        datos[0] = 100;

        // Esto causaría un error de compilación:
        // datos = new int[]{1, 2, 3};  // No se puede reasignar el parámetro final

        // Esto también causaría un error:
        // nombre = "Otro nombre";  // No se puede modificar el parámetro final
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String nombre = "Ejemplo";

        EjemploFinalParametro ejemplo = new EjemploFinalParametro();
        ejemplo.procesarDatos(numeros, nombre);

    }
}
