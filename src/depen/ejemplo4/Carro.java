package depen.ejemplo4;

class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del coche.");
    }
}