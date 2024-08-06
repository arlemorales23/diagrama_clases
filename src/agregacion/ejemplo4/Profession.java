package agregacion.ejemplo4;

public class Profession {
    private int id;
    private String professionName;
    private String university;


    public Profession(int id, String professionName, String university) {
        this.id = id;
        this.professionName = professionName;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", professionName='" + professionName + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
