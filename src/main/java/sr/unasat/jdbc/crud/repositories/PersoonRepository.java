package sr.unasat.jdbc.crud.repositories;

import com.mysql.jdbc.Driver;
import sr.unasat.jdbc.crud.entities.Persoon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersoonRepository {
    private Connection connection;

    public PersoonRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("De driver is geregistreerd!");

            String URL = "jdbc:mysql://localhost/adres_boek";
            String USER = "root";
            String PASS = "";
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(connection);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Persoon> findAllRecords() {
        List<Persoon> persoonList = new ArrayList<Persoon>();
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            String sql = "select * from persoon";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("resultset: " + rs);
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String naam = rs.getString("naam");
            /*    //Display values
               System.out.print("ID: " + id);
               System.out.print(", Age: " + naam);*/
                persoonList.add(new Persoon(id, naam));
                //  persoonList.add(new Persoon(rs.getInt("id"), rs.getString("naam")));
            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return persoonList;
    }


}
