package agregacion.ejemplo4;

public class ejemplo4Main {
    public static void main(String[] args) {
        WorkSpace workSpace = new WorkSpace("Developer","Programar");
        Profession profession = new Profession(10,"Engineer","Von humboldt");
        Employee employee = new Employee("Arle",profession,workSpace);
        System.out.printf(employee.toString());
    }
}
