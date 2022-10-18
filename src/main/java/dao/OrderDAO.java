package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {

    public static final String TABLE_NAME = "app_order";

    public void createTable(){
        try{
            //LOAD JDBC DRIVER
            Class.forName("org.postgresql.Driver");

            //established connection with database

            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres","9767635565");

            //3. CREATE STATEMENT OBJECT

            Statement stmt2 = con.createStatement();
            //4.EXECUTE QUERY

            String sql = "Select * from " + TABLE_NAME;
//            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "(id bigint NOT NULL,"
                    + "name text,"
                    + "address text,"
                    + "phone_number bigint,"
                    + "city text,"
                    + "state text,"
                    + "email_id text,"
                    + "category text, "
                    +"CONSTRAINT app_order_pk PRIMARY KEY(id))";
            System.out.println(" Create table query" + query);
            stmt2.executeUpdate(query);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
