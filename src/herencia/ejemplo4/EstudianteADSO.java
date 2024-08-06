package herencia.ejemplo4;

public class EstudianteADSO extends Estudiante{
    public EstudianteADSO(int id, String nombre) {
        super(id, nombre);
    }

    public EstudianteADSO(int id, String nombre, String curso) {
        super(id, nombre, curso);
    }
}
