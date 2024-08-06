package Final.ejemplo3;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    // Este método puede sobrescribir hacerSonido() porque no es final
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau guau!");
    }

    // Intentar sobrescribir getNombre() o respirar() causaría un error de compilación
    // Por ejemplo, si descomentamos el siguiente método, obtendríamos un error:
    /*
    @Override
    public String getNombre() {
        return "Perro: " + super.getNombre();
    }
    */
}
