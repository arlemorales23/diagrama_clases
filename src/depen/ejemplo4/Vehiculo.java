package depen.ejemplo4;

class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo se está deteniendo.");
    }
}