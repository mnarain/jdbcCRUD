package sr.unasat.jdbc.crud.repositories;

import sr.unasat.jdbc.crud.entities.Land;
import sr.unasat.jdbc.crud.entities.Persoon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LandRepository {
    private Connection connection;

    public LandRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("De driver is geregistreerd!");

            String URL = "jdbc:mysql://localhost:3306/adres_boek";
            String USER = "root";
            String PASS = "root";
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(connection);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Land> findAllRecords(){
        List<Land> landList = new ArrayList<Land>();
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            String sql = "select * from land";
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
                landList.add(new Land(id, naam));
                //  landList.add(new Land(rs.getInt("id"), rs.getString("naam")));
            }
            rs.close();


        } catch (SQLException e) {

        } finally {

        }
        return landList;
    }

    public int insertOneRecord(Land land) {
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "insert into land (naam) values(?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, land.getNaam());
            result = stmt.executeUpdate();
            System.out.println("resultset: " + result);

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

    public int deleteOneRecord(Land land){
        PreparedStatement stmt = null;
        int result = 0;
        try {
            String sql = "DELETE FROM persoon WHERE persoon.id = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, land.getId());
            result = stmt.executeUpdate();
            System.out.println("deleted: " + land.getId());

        } catch (SQLException e) {

        } finally {

        }
        return result;
    }

}
