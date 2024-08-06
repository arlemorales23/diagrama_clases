package depen.ejemplo4;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro miCoche = new Carro("Toyota", "Corolla", 4);
        miCoche.arrancar();  // Método heredado
        miCoche.abrirMaletero();  // Método propio
    }
}
