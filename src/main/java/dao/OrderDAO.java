package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {

    public static final String TABLE_NAME = "app_order";
    private DAOService daoService;
    public OrderDAO(){

        //constructor
        daoService =new DAOService();
    }



    public void createTable(){
        try{

            Connection con = daoService.getconnection();
            //LOAD JDBC DRIVER

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

            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
