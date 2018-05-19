package sr.unasat.jdbc.crud.app;

import sr.unasat.jdbc.crud.entities.Persoon;
import sr.unasat.jdbc.crud.repositories.PersoonRepository;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        PersoonRepository persoonRepo = new PersoonRepository();
        List<Persoon> persoonList = persoonRepo.findAllRecords();
        for (Persoon persoon : persoonList) {
            System.out.println(persoon);
        }
    }

}
