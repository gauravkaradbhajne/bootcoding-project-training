package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
        public static final String TABLE_NAME = "customer";

        public void createTable(){
            try{
                //LOAD JDBC DRIVER
                Class.forName("org.postgresql.Driver");

                //established connection with database

                Connection con = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/postgres",
                                "postgres","9767635565");

                //3. CREATE STATEMENT OBJECT

                Statement stmt = con.createStatement();
                //4.EXECUTE QUERY

                String sql = "Select * from " + TABLE_NAME;
                ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    System.out.println("Name = " + rs.getString("name"));
                    System.out.println(" Address= " +rs.getString("address"));
                    System.out.println(" phone= " +rs.getString("phone_number"));
                    System.out.println(" City= " +rs.getString("city"));
                    System.out.println(" City= " +rs.getString("state"));
                    System.out.println(" City= " +rs.getString("email_id"));


                }
            }catch (Exception ex){
              ex.printStackTrace();
            }

        }

}
