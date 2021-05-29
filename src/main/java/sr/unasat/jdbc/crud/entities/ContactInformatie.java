package sr.unasat.jdbc.crud.entities;

public class ContactInformatie {
    private Integer id;
    private String adres;
    private Integer telefoonNummer;
    private Persoon persoon;
    private Land land;

    public ContactInformatie(Integer id, String adres, Integer telefoonNummer, Persoon persoon, Land land) {
        this.id = id;
        this.adres = adres;
        this.telefoonNummer = telefoonNummer;
        this.persoon = persoon;
        this.land = land;
    }

    public ContactInformatie(String adres, Integer telefoonNummer, Persoon persoon, Land land) {
        this.adres = adres;
        this.telefoonNummer = telefoonNummer;
        this.persoon = persoon;
        this.land = land;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "ContactInformatie{" +
                "id=" + id +
                ", adres='" + adres + '\'' +
                ", telefoonNummer=" + telefoonNummer +
                ", persoon=" + persoon +
                ", land=" + land +
                '}';
    }
}
