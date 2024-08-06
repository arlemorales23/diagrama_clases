package agregacion.ejemplo4;

public class Employee {
    private String name;

    Profession profession;
    WorkSpace workSpace;


    public Employee(String name, Profession profession, WorkSpace workSpace) {
        this.name = name;
        this.profession = profession;
        this.workSpace = workSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name=" + name + '\'' +
                ", profession=" + profession +
                ", workSpace=" + workSpace
                ;
    }
}
