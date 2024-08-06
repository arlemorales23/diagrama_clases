package agregacion.ejemplo4;

public class WorkSpace {
    private String name;
    private String areaFunction;


    public WorkSpace(String name, String areaFunction) {
        this.name = name;
        this.areaFunction = areaFunction;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaFunction() {
        return areaFunction;
    }

    public void setAreaFunction(String areaFunction) {
        this.areaFunction = areaFunction;
    }


    @Override
    public String toString() {
        return "WorkSpace{" +
                "name='" + name + '\'' +
                ", areaFunction='" + areaFunction + '\'' +
                '}';
    }
}
