package sr.unasat.jdbc.crud.app;

import sr.unasat.jdbc.crud.entities.ContactInformatie;
import sr.unasat.jdbc.crud.entities.Persoon;
import sr.unasat.jdbc.crud.repositories.ContactInformatieRepository;
import sr.unasat.jdbc.crud.repositories.PersoonRepository;

import java.util.List;

public class Application {

    public static void main(String[] args) {
  /*      PersoonRepository persoonRepo = new PersoonRepository();
        List<Persoon> persoonList = persoonRepo.findAllRecords();
        for (Persoon persoon : persoonList) {
            System.out.println(persoon);
        } */

        ContactInformatieRepository ciRepo = new ContactInformatieRepository();
 /*       List<ContactInformatie> contactList = ciRepo.findAllRecords();
        for (ContactInformatie contact : contactList) {
            System.out.println(contact);
        }
*/

        ContactInformatie ci = ciRepo.findOneRecord(1234, "Manjastraat 10");
        System.out.println("single record: " + ci);

    }



}
