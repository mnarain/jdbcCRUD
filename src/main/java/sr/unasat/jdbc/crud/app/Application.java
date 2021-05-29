package sr.unasat.jdbc.crud.app;

import sr.unasat.jdbc.crud.entities.ContactInformatie;
import sr.unasat.jdbc.crud.entities.Land;
import sr.unasat.jdbc.crud.entities.Persoon;
import sr.unasat.jdbc.crud.repositories.ContactInformatieRepository;
import sr.unasat.jdbc.crud.repositories.LandRepository;
import sr.unasat.jdbc.crud.repositories.PersoonRepository;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        PersoonRepository persoonRepo = new PersoonRepository();
        List<Persoon> persoonList = persoonRepo.findAllRecords();
        for (Persoon persoon : persoonList) {
            System.out.println(persoon);
        }

        // Persoon martha = new Persoon("Martha");
       // persoonRepo.insertOneRecord(martha);

        ContactInformatieRepository ciRepo = new ContactInformatieRepository();
        List<ContactInformatie> contactList = ciRepo.findAllRecords();
        for (ContactInformatie contact : contactList) {
            System.out.println(contact);
        }

        LandRepository landRepo = new LandRepository();

  //      Land guyana = new Land("Guyana");
  //      landRepo.insertOneRecord(guyana);

        List<Land> landList = landRepo.findAllRecords();
        for (Land land : landList) {
            System.out.println(land);
        }

/*        Persoon person = new Persoon(4);
        persoonRepo.deleteOneRecord(person);*/

//        int pk = persoonRepo.insertOneRecord(new Persoon("Ellen"));

//        ContactInformatieRepository ci = new ContactInformatieRepository();
//        ContactInformatie recordFound = ci.findOneRecord(1234, "Manjastraat 10");
//        System.out.println("single record: " + ci);
//
//        recordFound.setTelefoonNummer(8888);
//        recordFound.getPersoon().setId(4);
//        ci.updateOneRecord(recordFound);
//
//        System.out.println(ci.findAllRecords());


    }


}
