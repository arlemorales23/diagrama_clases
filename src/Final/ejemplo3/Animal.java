package Final.ejemplo3;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método final que no puede ser sobrescrito
    public final String getNombre() {
        return nombre;
    }

    // Método que puede ser sobrescrito
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    // Otro método final
    public final void respirar() {
        System.out.println(nombre + " está respirando");
    }
}