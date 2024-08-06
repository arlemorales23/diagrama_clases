package Final.ejemplo3;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal genérico");
        Perro perro = new Perro("Fido");

        System.out.println(animal.getNombre());  // Imprime: Animal genérico
        animal.hacerSonido();  // Imprime: El animal hace un sonido
        animal.respirar();  // Imprime: Animal genérico está respirando

        System.out.println(perro.getNombre());  // Imprime: Fido
        perro.hacerSonido();  // Imprime: El perro ladra: Guau guau!
        perro.respirar();  // Imprime: Fido está respirando
    }
}
