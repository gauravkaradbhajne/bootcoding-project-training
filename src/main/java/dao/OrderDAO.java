package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {

    public static final String TABLE_NAME = "customer_order";

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
            ResultSet rs = stmt2.executeQuery(sql);

            while(rs.next()){
                System.out.println("tota_amount = " + rs.getString("total_amount"));
                System.out.println(" Order Date =" +rs.getString("order_date"));
                System.out.println("Status =" +rs.getString("status"));
                System.out.println(" Delivery Address =" +rs.getString("delivery_address"));



            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
