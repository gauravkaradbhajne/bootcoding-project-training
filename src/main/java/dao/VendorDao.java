package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VendorDao {
    public static final String TABLE_NAME = "app_vendor";

    private DAOService daoService;
    public VendorDao(){

        //constructor
        daoService =new DAOService();
    }


    public void createTable(){
        try{
            Connection con = daoService.getconnection();



            //3. CREATE STATEMENT OBJECT

            Statement stmt = con.createStatement();
            //4.EXECUTE QUERY

            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "(id bigint NOT NULL,"
                    +"vendor_id bigint,"
                    + "customer_id bigint,"
                    + "total_amount decimal,"
                    + "order_date timestamp,"
                    + "status text,"
                    + "delivery_address varchar,"
                    + "category text, "
                    +"CONSTRAINT app_vendor_pk PRIMARY KEY(id))";
            System.out.println(" Create table query" + query);
            stmt.executeUpdate(query);

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
