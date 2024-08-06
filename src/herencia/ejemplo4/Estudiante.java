package herencia.ejemplo4;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante(int id, String nombre) {
        super(id, nombre);
    }

    public Estudiante(int id, String nombre, String curso) {
        super(id, nombre);
        this.curso = curso;
    }
    public void mostrar(){
        System.out.println(this.nombre);
    }
    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso + '}';

    }
}
