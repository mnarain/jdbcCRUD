package sr.unasat.jdbc.crud.entities;

public class Land {
    private Integer id;
    private String naam;

    public Land(Integer id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public Land(String naam) {
        this.naam = naam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Land{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                '}';
    }

}
