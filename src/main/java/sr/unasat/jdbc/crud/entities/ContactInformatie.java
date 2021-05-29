package sr.unasat.jdbc.crud.entities;

public class ContactInformatie {
    private int id;
    private String adres;
    private int telefoonNummer;
    private Persoon persoon;
    private Land land;

    public ContactInformatie(int id, String adres, int telefoonNummer, Persoon persoon) {
        this.id = id;
        this.adres = adres;
        this.telefoonNummer = telefoonNummer;
        this.persoon = persoon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(int telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    @Override
    public String toString() {
        return "ContactInformatie{" +
                "id=" + id +
                ", adres='" + adres + '\'' +
                ", telefoonNummer=" + telefoonNummer +
                ", persoon=" + persoon +
                '}';
    }
}
